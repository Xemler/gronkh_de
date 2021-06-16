package img;

import rnd.SMath;
import rnd_form.RndQube;
import rnd_form.SimpleRandomRect;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class BasicImage extends BufferedImage {



    private RndQube   size;




    public BasicImage(int width, int height, int imageType) {
        super(width, height, imageType);

        init( width, height );
    }

    public BasicImage(int width, int height, int imageType, IndexColorModel cm) {
        super(width, height, imageType, cm);
        init( width, height );

    }

    public BasicImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
        super(cm, raster, isRasterPremultiplied, properties);

        init( raster.getWidth(), raster.getHeight() );

    }




    private void init( int w, int h )
    {
        size = new SimpleRandomRect(0, 0, w, h, 1.0);
    }

    public int[] getInsets( )
    {
        return new int[] { (int)size.getOriginX(),
                (int)size.getOriginY(),
                (int)(size.getWidth()),
                        (int)(size.getHeight()) };
    }


    public void setInsets(RndQube q) {
        size.setInsets( q );
    }



    public void move( double ox, double oy )
    {

        double[] origin  = size.getOrigin();

        origin[0] += ox;
        origin[1] += oy;


        size.setOrigin(
                origin
        );
    }

    public void random_construct(RndQube  wx, int c)
    {

        for (int i = 0; i < c; i++) {
            int[] p =  wx.next();

            SMath.min_max( p, new int[]{0, 0}, new int[]{getWidth(), getHeight()} );


            Color cc  =  wx.nextColors()[0];

            super.setRGB(p[0], p[1], cc.getRGB());
        }
    }


}
