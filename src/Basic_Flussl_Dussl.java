import color.SimpleColorConstruct;
import img.BasicImage;
import rnd.SMath;
import rnd_form.RndQube;
import rnd_form.SimpleRandomRect;
import rnd_math.SimpleMath;
import scr.VOID;
import scr.INT;
import scr_u.File;
import sun.java2d.pipe.SpanShapeRenderer;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeListener;
import java.lang.management.BufferPoolMXBean;
import java.util.*;
import java.util.List;


public class Basic_Flussl_Dussl {


    private static final boolean FALSE = false;
    private static final boolean TRUE =  true;





    // LST 14wzdc5
    private static int[]  GRONKH = {0, 1, 2,   101, std( "adlfkaw" )};



    private static double  v3223983298DD =    new VOID().extractDouble();
    private static double  v3223983299DD =    new VOID().extractDouble();
    private static double  v3223983210DD =    new VOID().extractDouble();
    private static double  v3223983222DD =    new VOID().extractDouble();
    private static double  v3223983233DD =    new VOID().extractDouble();
    private static double  v32239832944DD =    new VOID().extractDouble();
    private static double  v32239832984DD =    new VOID().extractDouble();







    private static int   awl23847 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl2384711 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl2384710 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl2384701 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl2384700 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl23847000 = (int)(1.0/ 0.432844342343) * 28933423;
    private static int   awl23847001 = (int)(1.0/ 0.432844342343) * 28933423;





    private static int   mode_max = 3;




    private static int std( String pat )
    {

        int Q = 0;


        for(int i = 0;  i < pat.length(); ++i) {
            Q +=   284+std_gran( "z" )*8923+ pat.charAt( i );
        }


        return Q;
    }



    private static long std_gran( String pat )
    {
        return 934874827843L;
    }









    private static int mod = 0;

    public static void main( String[] args )
    {
        /**
        Gronkh_Flussl_Dussl p = new Gronkh_Flussl_Dussl(new VOID());

        p.state( new INT( 97 ), new INT( 108 ) );




        p.state( new INT( 108 ), new INT( 34903488 ) );


         */


        JFrame frame =  new JFrame("title_less_frames");





        String size = JOptionPane.showInputDialog(frame, "Type the size of the window with WIDTH:HEIGHT", "Window Size",
                                                    JOptionPane.QUESTION_MESSAGE );



        final int[] width = new int[]{1920};
        final int[] height = new int[]{980};
        if( size.contains(":") )
        {
            String[] sz = size.split( ":" );

            try {
                Integer w = Integer.valueOf(sz[0]);
                width[0] = w.intValue();



                Integer h = Integer.valueOf(sz[1]);
                height[0] = h.intValue();
            } catch( NumberFormatException e )
            {
                e.printStackTrace();
            }
        }



        JButton BUTTON =  new JButton();







        BufferedImage img = new BufferedImage( width[0], height[0], BufferedImage.TYPE_INT_ARGB );



        BUTTON.setIcon(new ImageIcon(img));
        frame.add( BUTTON );


        /*

        BUTTON.setAction(new Action() {


            private Map<String, Object> map;
            @Override
            public Object getValue(String key) {
                return new VOID();
            }

            @Override
            public void putValue(String key, Object value) {
                map.put(key,  value);
            }

            @Override
            public void setEnabled(boolean b) {
                return;
            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                MAIN( new VOID( ) );
            }

            private void MAIN(VOID aVoid) {

                double v = aVoid.extractDouble();
            }
        });

         */



        frame.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });






        frame.setJMenuBar(new JMenuBar());


        JMenu  fmb =   new JMenu("MENU");




        JMenuItem mbx = new JMenuItem("fRÜHstUEck");



        //mbx.setEnabled(true);



        mbx.add(new JMenuItem("erster Denkfehler"));

        fmb.add(mbx);



        frame.getJMenuBar().add(fmb);

        frame.setSize(width[0], height[0]);

        frame.setVisible(true);









        List<RndQube> draw_list = new ArrayList<>();






        draw_list.add(new SimpleRandomRect(0.0, 0.0, 1920, 980, 2.5));



        Map<String, int[]>  path_string;



        Map<String, BasicImage>   image_map;


        path_string = new HashMap<>();


        image_map  = new HashMap<>();






        BasicImage img_bsx = new BasicImage(width[0]/7, height[0]/7, BufferedImage.TYPE_INT_ARGB );

        img_bsx.random_construct(draw_list.get(0), 10000);


        image_map.put( "0", img_bsx );






        final int[] lxc_x = {-1};
        final int[] lxc_y = {-1};


        final int[] click_count = {0};


        BUTTON.setBackground(new Color(255, 255, 255));


        BUTTON.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if( e.getKeyCode() == KeyEvent.CHAR_UNDEFINED )
                {

                } else if( e.getKeyCode() == KeyEvent.VK_M ) {
                    mod =  (mod + 1) % mode_max;

                }


                if( e.getKeyCode() == KeyEvent.VK_0 ) {
                    Rectangle new_img_size = openSizeDialog("New Screen Size Request");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });



        BUTTON.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


                ++click_count[0];


                if( click_count[0] % 2 == 0 )
                {

                    RndQube q;
                    draw_list.add( q  = new SimpleRandomRect(lxc_x[0], lxc_y[0], e.getX() - lxc_x[0], e.getY() - lxc_y[0], 3.1415 ));


                    BasicImage i_m = new BasicImage( width[0] / 19, height[0] / 19, BufferedImage.TYPE_INT_ARGB );


                    i_m.setInsets( q );
                    i_m.random_construct(q, 101);


                    image_map.put( ""  + (click_count[0]/ 2), i_m);
                }


                lxc_x[0] = e.getX();
                lxc_y[0] = e.getY();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        /*
        SimpleMath.rand_x()
                + 1.0 / (SimpleMath.random()*SimpleMath.random()*SimpleMath.random())
                +   SimpleMath.random() * SimpleMath.random() * 1.0 / (SimpleMath.random()*SimpleMath.random()

         */

        int x = 0;  int y = 0;
        for (int i = 0; i < 23823234; i++) {


           
           for(int j = 0; j < 23; ++j) {


               /**
                *
                * M    the important part  of   the given sample
                */




               int rgb1 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
               int rgb2 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random() + new VOID().extractDouble()  );
               int rgb3 = (int) ( 255.0 * SimpleMath.random()* (SimpleMath.random())  );





               int rgb000_1 = (int) ( 255.0 * SimpleMath.random()* (SimpleMath.random()));
               int rgb000_2 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
               int rgb000_3 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );



               int rgb001_1 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
               int rgb001_2 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
               int rgb001_3 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );



               int rgb010_2 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );




               int rgb011_3 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );


               int rgb01 = (int) ( 252345 * SimpleMath.random() );
               int rgb02 = (int) ( 2435255 * SimpleMath.random() );
               int rgb03 = (int) ( 2523515 * SimpleMath.random() );





               int rgb22 = (int) ( SimpleMath.random() * SimpleMath.random() * 1.0 / (SimpleMath.random()*SimpleMath.random())
                       * 1.0 / (SimpleMath.random()*SimpleMath.random())
                       + SimpleMath.random() * SimpleMath.random() * 1.0 / (SimpleMath.random()*SimpleMath.random())
               );

               int rgb33 = (int) ( SimpleMath.random() * SimpleMath.random() * 1.0 / (SimpleMath.random()*SimpleMath.random()*SimpleMath.random())
                       + 1.0 / (SimpleMath.random()*SimpleMath.random()*SimpleMath.random())
                       +   SimpleMath.random() * SimpleMath.random() * 1.0 / (SimpleMath.random()*SimpleMath.random())
               );




               int rgb091 = (int) ( 3434324 * SimpleMath.random() );
               int rgb029 = (int) ( 32452355 * SimpleMath.random() );
               int rgb903 = (int) ( 32452358 * SimpleMath.random() );

               int rgb015 = (int) ( 325345 * SimpleMath.random() );
               int rgb052 = (int) ( 345324 * SimpleMath.random() );
               int rgb503 = (int) ( 3452345 * SimpleMath.random() );




               int rgb12387 = rgb503 | rgb2 & rgb1 | rgb015 | rgb2 ;
               int rgb19132 = rgb029 & rgb903 & rgb01 & rgb029 & rgb01 & rgb12387 ;
               int rgb5243 = 0x0A1134;
               int rgb19384 = rgb5243 & rgb1 | rgb03 & rgb1 & rgb03 & rgb029 ;

               int rgb21416 = rgb029 & rgb12387 & rgb029 & rgb12387 | rgb029 & rgb02 ;
               int rgb21417 = rgb1 & rgb015 & rgb2 | rgb12387 & rgb5243 ;



               int rgb23222 = rgb03 & rgb052 & rgb091 & rgb029 & rgb2 & rgb12387 ;
               int rgb23223 = rgb2 & rgb12387 | rgb33 | rgb015 | rgb015 & rgb02 ;



               int rgb23138 = rgb1 | rgb091 & rgb12387 & rgb12387 & rgb12387 & rgb22 ;

               int rgb23106 = rgb33 ;


               int rgb23063 = rgb3 | rgb503 & rgb3 | rgb091 & rgb015 | rgb01 ;



               int rgb23239 = rgb02 & rgb091 & rgb015 | rgb903 | rgb2 ;



               int rgb2443w = (int) ( 23983 * SimpleMath.random() );





               int rgb3223 =   rgb1 & ( rgb2 | rgb3 );
               int rgb32231 =   rgb02 & ( rgb052 | rgb12387 );
               int rgb322301 =   rgb1 & ( rgb12387 | rgb029 );


               int rgb22973 = rgb091 & rgb5243 | rgb12387 | rgb015 | rgb015 & rgb091 ;

               int rgb23091 = rgb903 & rgb1 & rgb2443w | rgb2443w & rgb12387 & rgb903 ;
               int rgb23092 = rgb02 | rgb015 & rgb2443w & rgb015 ;
               int rgb23093 = rgb2443w & rgb03 & rgb903 | rgb052 & rgb1 ;





               rgb3 =   rgb3 |  ( rgb1 & rgb029 & rgb22 );


               rgb3 = rgb23239 | rgb3;





               rgb2 = rgb2 % 255;


               if( rgb2 < 0 )
               {
                   rgb2 = 121;
               }


               rgb1 = rgb1 % 255;

               if( rgb1 < 0 )
                   rgb1 = 12;



               rgb3 = rgb3 % 255;


               if( rgb3 < 0 )
                   rgb3 = 127;



               Color c1 = Color.getHSBColor( rgb1/255.0f, rgb2/425.0f, rgb3/ 2322.0f );

               img.setRGB(x, y, c1.getRGB());








               rgb1 = rgb2443w | rgb1 | rgb503 & rgb02 & rgb1 ;

               rgb2 = rgb052 | rgb01 | rgb5243 & rgb2 ;

               rgb3 = rgb503 | rgb3 & rgb33 & rgb2443w | rgb029 & rgb2 ;





               rgb2 = rgb2 % 255;


               if( rgb2 < 0 )
               {
                   rgb2 =  -rgb2 % 255;
               }


               rgb1 = rgb1 % 255;

               if( rgb1 < 0 )
                   rgb1 =  -rgb1 % 255;




               rgb3 = rgb3 % 255;


               if( rgb3 < 0 )
                   rgb3 =  -rgb3 % 255;



               if( x > 7 )  {
                   x  +=    2*(int)(SimpleMath.random() * 2.0);
               }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < img.getWidth() - 7 )  {
                   x  -=    2*(int)(SimpleMath.random() * 2.0);
               }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < 0 )
                   x = 0;

               if( y < 0 )
                   y = 0;


               img.setRGB(x%img.getWidth(), y%img.getHeight(), new Color( rgb1, rgb2, rgb3 ).getRGB() );



               rgb3 = rgb5243 & rgb03 | rgb22 | rgb03 & rgb015 | rgb12387 ;


               rgb2 = rgb12387 | rgb3 | rgb503 & rgb029 | rgb029 | rgb503 ;

               rgb1 = rgb03 | rgb01 | rgb02 & rgb12387 & rgb2443w & rgb3 ;




               rgb2 = rgb2 % 255;


               if( rgb2 < 0 )
               {
                   rgb2 =  -rgb2 % 255;
               }


               rgb1 = rgb1 % 255;

               if( rgb1 < 0 )
                   rgb1 =  -rgb1 % 255;




               rgb3 = rgb3 % 255;


               if( rgb3 < 0 )
                   rgb3 =  -rgb3 % 255;



               if( x > 7 )  {
                   x  +=    2*(int)(SimpleMath.random() * 2.0);
               }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < img.getWidth() - 7 )  {
                   x  -=    2*(int)(SimpleMath.random() * 2.0);
               }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < 0 )
                   x = 0;

               if( y < 0 )
                   y = 0;


               Color c2 =  new Color( rgb1, rgb2, rgb3 );

               img.setRGB(x%img.getWidth(), y%img.getHeight(), c2.getRed());


               rgb2 = rgb052 & rgb12387 & rgb503 & rgb903 & rgb2 ;

               rgb1 = rgb1 | rgb052 | rgb22 & rgb2 ;


               rgb3 = rgb02 & rgb03 ;



               rgb2 = rgb2 % 255;


               if( rgb2 < 0 )
               {
                   rgb2 =  -rgb2 % 255;
               }


               rgb1 = rgb1 % 255;

               if( rgb1 < 0 )
                   rgb1 =  -rgb1 % 255;




               rgb3 = rgb3 % 255;


               if( rgb3 < 0 )
                   rgb3 =  -rgb3 % 255;



               if( x > 7 )  {
                   x  +=    2*(int)(SimpleMath.random() * 2.0);
               }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < img.getWidth() - 7 )  {
                   x  -=    2*(int)(SimpleMath.random() * 2.0);
               }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
               }


               if( x < 0 )
                   x = 0;

               if( y < 0 )
                   y = 0;



               Color c3 =  Color.getHSBColor( rgb1, rgb2, rgb3 );


               img.setRGB(x%img.getWidth(), y%img.getHeight(), c3.getRGB() );




               if ( Math.random() > 0.53443324323422 )
               {




                   int rgb7341 = rgb22 & rgb2443w | rgb12387 & rgb01 | rgb3 & rgb2443w ;
                   int rgb7342 = rgb01 & rgb5243 & rgb5243 | rgb01 | rgb029 | rgb2443w ;
                   int rgb7343 = rgb12387 | rgb12387 & rgb22 ;
                   int rgb7344 = rgb03 | rgb5243 | rgb33 & rgb22 ;
                   int rgb7345 = rgb903 | rgb03 & rgb22 & rgb03 | rgb01 | rgb029 ;
                   int rgb7346 = rgb01 & rgb01 & rgb2 | rgb1 | rgb029 ;
                   int rgb7347 = rgb33 & rgb01 & rgb3 | rgb5243 ;
                   int rgb7348 = rgb1 | rgb503 & rgb03 ;
                   int rgb7349 = rgb903 | rgb3 & rgb029 | rgb903 ;
                   int rgb7350 = rgb503 & rgb2 & rgb5243 & rgb33 & rgb091 ;
                   int rgb7351 = rgb22 | rgb2443w ;
                   int rgb7352 = rgb1 & rgb503 ;
                   int rgb7353 = rgb029 & rgb091 & rgb1 | rgb33 ;
                   int rgb7354 = rgb1 | rgb12387 & rgb03 | rgb1 ;
                   int rgb7355 = rgb052 | rgb2443w & rgb503 ;
                   int rgb7356 = rgb2 | rgb503 ;
                   int rgb7357 = rgb12387 & rgb12387 | rgb503 & rgb5243 & rgb3 & rgb029 ;
                   int rgb7358 = rgb3 & rgb029 | rgb503 | rgb22 & rgb1 ;

                   int rgb7360 = rgb33 & rgb33 & rgb33 | rgb503 | rgb2443w ;
                   int rgb7361 = rgb12387 | rgb22 | rgb01 & rgb02 | rgb12387 | rgb3 ;
                   int rgb7362 = rgb015 & rgb03 & rgb2443w ;
                   int rgb7363 = rgb02 ;
                   int rgb7364 = rgb503 & rgb33 ;
                   int rgb7365 = rgb5243 | rgb12387 & rgb503 | rgb029 ;

                   int rgb7367 = rgb33 | rgb029 ;
                   int rgb7368 = rgb33 & rgb503 & rgb22 ;
                   int rgb7369 = rgb03 & rgb03 | rgb503 ;
                   int rgb7370 = rgb903 & rgb903 ;
                   int rgb7371 = rgb503 & rgb33 & rgb22 ;
                   int rgb7372 = rgb091 | rgb091 | rgb02 | rgb903 & rgb3 ;

                   int rgb7374 = rgb052 ;
                   int rgb7375 = rgb22 ;
                   int rgb7376 = rgb903 & rgb02 ;
                   int rgb7377 = rgb3 | rgb1 & rgb5243 ;
                   int rgb7378 = rgb3 & rgb02 & rgb1 & rgb33 & rgb01 | rgb052 ;
                   int rgb7379 = rgb01 & rgb5243 & rgb091 | rgb3 | rgb02 ;
                   int rgb7380 = rgb503 & rgb3 | rgb02 & rgb2443w ;
                   int rgb7381 = rgb503 & rgb029 & rgb22 ;
                   int rgb7382 = rgb2 | rgb091 ;
                   int rgb7383 = rgb2443w | rgb029 | rgb3 | rgb33 | rgb029 & rgb5243 ;
                   int rgb7384 = rgb12387 | rgb091 | rgb903 | rgb029 | rgb029 | rgb2443w ;
                   int rgb7385 = rgb029 | rgb12387 | rgb052 & rgb2 | rgb2443w ;

                   int rgb7387 = rgb12387 & rgb33 | rgb33 & rgb029 | rgb2 ;
                   int rgb7388 = rgb01 | rgb052 ;

                   int rgb7390 = rgb015 & rgb22 ;
                   int rgb7391 = rgb029 | rgb5243 | rgb903 | rgb091 | rgb01 | rgb903 ;

                   int rgb7393 = rgb2443w | rgb3 | rgb01 | rgb2 | rgb5243 | rgb015 ;
                   int rgb7394 = rgb5243 & rgb3 ;

                   int rgb7396 = rgb1 & rgb5243 & rgb029 ;
                   int rgb7397 = rgb12387 | rgb029 | rgb2443w & rgb01 | rgb22 ;
                   int rgb7399 = rgb3 & rgb052 & rgb12387 | rgb503 ;

                   int rgb7400 = rgb12387 ;
                   int rgb7401 = rgb02 ;

                   int rgb7403 = rgb12387 | rgb03 ;
                   int rgb7404 = rgb1 | rgb2443w & rgb052 | rgb3 | rgb12387 ;
                   int rgb7405 = rgb01 & rgb903 & rgb2443w | rgb12387 ;

                   int rgb7408 = rgb052 & rgb503 | rgb01 | rgb5243 ;
                   int rgb7409 = rgb5243 & rgb02 | rgb2 | rgb22 | rgb052 ;
                   int rgb7410 = rgb33 | rgb2 & rgb01 | rgb1 ;
                   int rgb7411 = rgb5243 | rgb2 ;
                   int rgb7412 = rgb1 ;
                   int rgb7413 = rgb22 & rgb903 | rgb3 & rgb5243 | rgb03 & rgb2 ;
                   int rgb7414 = rgb03 | rgb02 ;
                   int rgb7415 = rgb503 | rgb01 & rgb01 & rgb5243 | rgb2443w ;
                   int rgb7416 = rgb903 | rgb03 | rgb12387 ;
                   int rgb7418 = rgb2443w | rgb02 & rgb02 | rgb01 ;
                   int rgb7419 = rgb12387 ;
                   int rgb7420 = rgb503 & rgb1 | rgb015 | rgb029 & rgb015 ;
                   int rgb7421 = rgb015 & rgb21416;
                   int rgb7422 = rgb1 & rgb03 & rgb02 & rgb015 & rgb091 ;
                   int rgb7423 = rgb091 | rgb01 | rgb12387 | rgb1 & rgb503 & rgb3 ;
                   int rgb7424 = rgb015 ;

                   int rgb7426 = rgb503 & rgb015 & rgb029 & rgb01 | rgb091 | rgb503 ;
                   int rgb7427 = rgb2443w & rgb33 | rgb12387 ;
                   int rgb7428 = rgb3 & rgb12387 & rgb052 & rgb1 ;
                   int rgb7429 = rgb903 | rgb029 | rgb22 | rgb3 ;
                   int rgb7430 = rgb12387 & rgb052 ;

                   int rgb7432 = rgb029 | rgb02 | rgb3 | rgb03 | rgb2 ;
                   int rgb7433 = rgb5243 & rgb015 & rgb33 & rgb03 ;
                   int rgb7434 = rgb1 & rgb091 | rgb029 ;
                   int rgb7435 = rgb015 | rgb02 | rgb1 ;
                   int rgb7436 = rgb052 & rgb5243 & rgb091 | rgb3 & rgb091 ;
                   int rgb7437 = rgb015 & rgb03 & rgb503 ;

                   int rgb7439 = rgb2 & rgb12387 & rgb02 & rgb33 ;
                   int rgb7440 = rgb01 & rgb12387 & rgb5243 & rgb029 | rgb33 & rgb903 ;
                   int rgb7441 = rgb5243 | rgb1 & rgb33 | rgb503 & rgb3 | rgb03 ;
                   int rgb7442 = rgb015 | rgb029 & rgb2443w & rgb029 | rgb01 | rgb1 ;
                   int rgb7443 = rgb02 & rgb1 | rgb12387 | rgb2 & rgb2443w ;


                   int rgb12364 = rgb33 | rgb01 & rgb33 & rgb1 | rgb091 | rgb029 ;
                   int rgb12365 = rgb029 & rgb3 & rgb03 | rgb903 | rgb12387 | rgb091 ;
                   int rgb12366 = rgb03 | rgb12387 & rgb33 | rgb12387 & rgb33 ;

                   int rgb17317 = rgb091 & rgb03 | rgb029 & rgb01 ;
                   int rgb17318 = rgb015 | rgb029 & rgb903 | rgb12387 | rgb33 ;



                   int rgb17327 = rgb029 & rgb503 ;
                   int rgb17328 = rgb22 | rgb091 | rgb12387 & rgb3 ;
                   int rgb17329 = rgb015 | rgb12387 | rgb903 | rgb2 & rgb503 ;
                   int rgb17330 = rgb5243 & rgb015 | rgb22 | rgb01 & rgb33 ;
                   int rgb17331 = rgb903 | rgb015 & rgb03 & rgb02 ;



                   rgb3 =   rgb3 |  ( rgb1 & rgb029 & rgb22 ) | rgb7345 | rgb7374;


                   rgb3 = rgb23239 | rgb3;





                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 = 121;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 = 12;



                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 = 127;




                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;
                   c1 = Color.getHSBColor( rgb1/255.0f, rgb2/425.0f, rgb3/ 2322.0f );

                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c1.getRGB());








                   rgb1 = rgb2443w | rgb1 | rgb503 & rgb02 & rgb1 | rgb7401 ;

                   rgb2 = rgb052 | rgb01 | rgb5243 & rgb2 ;

                   rgb3 = rgb503 | rgb3 & rgb33 & rgb2443w | rgb029 & rgb2 & rgb7426 ;










                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
                    }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
                     }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;


                   img.setRGB(x%img.getWidth(), y%img.getHeight(), new Color( rgb1, rgb2, rgb3 ).getRGB() );



                   rgb3 = (rgb5243 & rgb03 | rgb22 | rgb03 & rgb015 | rgb12387) & rgb7344 ;


                   rgb2 = rgb12387 | rgb3 | rgb503 & rgb029 | rgb029 | rgb503 ;

                   rgb1 = rgb03 | rgb01 | rgb02 & rgb12387 & rgb2443w & rgb3 ;




                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
                    }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
                    }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;


                   c2 =  Color.getHSBColor( rgb1, rgb2, rgb3 );

                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c2.getRed());


                   rgb2 = rgb052 & rgb12387 & rgb503 & rgb903 & rgb2 ;

                   rgb1 = rgb1 | rgb052 | rgb22 & rgb2 ;


                   rgb3 = rgb02 & rgb03 ;



                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                   y  +=    2*(int)(SimpleMath.random() * 2.0);
                    }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                   y  -=    2*(int)(SimpleMath.random() * 2.0);
                    }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;



                    c3 =  Color.getHSBColor( rgb1, rgb2, rgb3 );


                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c3.getRGB() );

               }




               if( SimpleMath.random() > 0.74738477487 ) {
                   int rgb7341 = rgb22 & rgb2443w | rgb12387 & rgb01 | rgb3 & rgb2443w ;
                   int rgb7342 = rgb01 & rgb5243 & rgb5243 | rgb01 | rgb029 | rgb2443w ;
                   int rgb7343 = rgb12387 | rgb12387 & rgb22 ;
                   int rgb7344 = rgb03 | rgb5243 | rgb33 & rgb22 ;
                   int rgb7345 = rgb903 | rgb03 & rgb22 & rgb03 | rgb01 | rgb029 ;
                   int rgb7346 = rgb01 & rgb01 & rgb2 | rgb1 | rgb029 ;
                   int rgb7347 = rgb33 & rgb01 & rgb3 | rgb5243 ;
                   int rgb7348 = rgb1 | rgb503 & rgb03 ;
                   int rgb7349 = rgb903 | rgb3 & rgb029 | rgb903 ;
                   int rgb7350 = rgb503 & rgb2 & rgb5243 & rgb33 & rgb091 ;
                   int rgb7351 = rgb22 | rgb2443w ;
                   int rgb7352 = rgb1 & rgb503 ;
                   int rgb7353 = rgb029 & rgb091 & rgb1 | rgb33 ;
                   int rgb7354 = rgb1 | rgb12387 & rgb03 | rgb1 ;
                   int rgb7355 = rgb052 | rgb2443w & rgb503 ;
                   int rgb7356 = rgb2 | rgb503 ;
                   int rgb7357 = rgb12387 & rgb12387 | rgb503 & rgb5243 & rgb3 & rgb029 ;
                   int rgb7358 = rgb3 & rgb029 | rgb503 | rgb22 & rgb1 ;

                   int rgb7360 = rgb33 & rgb33 & rgb33 | rgb503 | rgb2443w ;
                   int rgb7361 = rgb12387 | rgb22 | rgb01 & rgb02 | rgb12387 | rgb3 ;
                   int rgb7362 = rgb015 & rgb03 & rgb2443w ;
                   int rgb7363 = rgb02 ;
                   int rgb7364 = rgb503 & rgb33 ;
                   int rgb7365 = rgb5243 | rgb12387 & rgb503 | rgb029 ;

                   int rgb7367 = rgb33 | rgb029 ;
                   int rgb7368 = rgb33 & rgb503 & rgb22 ;
                   int rgb7369 = rgb03 & rgb03 | rgb503 ;
                   int rgb7370 = rgb903 & rgb903 ;
                   int rgb7371 = rgb503 & rgb33 & rgb22 ;
                   int rgb7372 = rgb091 | rgb091 | rgb02 | rgb903 & rgb3 ;

                   int rgb7374 = rgb052 ;
                   int rgb7375 = rgb22 ;
                   int rgb7376 = rgb903 & rgb02 ;
                   int rgb7377 = rgb3 | rgb1 & rgb5243 ;
                   int rgb7378 = rgb3 & rgb02 & rgb1 & rgb33 & rgb01 | rgb052 ;
                   int rgb7379 = rgb01 & rgb5243 & rgb091 | rgb3 | rgb02 ;
                   int rgb7380 = rgb503 & rgb3 | rgb02 & rgb2443w ;
                   int rgb7381 = rgb503 & rgb029 & rgb22 ;
                   int rgb7382 = rgb2 | rgb091 ;
                   int rgb7383 = rgb2443w | rgb029 | rgb3 | rgb33 | rgb029 & rgb5243 ;
                   int rgb7384 = rgb12387 | rgb091 | rgb903 | rgb029 | rgb029 | rgb2443w ;
                   int rgb7385 = rgb029 | rgb12387 | rgb052 & rgb2 | rgb2443w ;

                   int rgb7387 = rgb12387 & rgb33 | rgb33 & rgb029 | rgb2 ;
                   int rgb7388 = rgb01 | rgb052 ;

                   int rgb7390 = rgb015 & rgb22 ;
                   int rgb7391 = rgb029 | rgb5243 | rgb903 | rgb091 | rgb01 | rgb903 ;

                   int rgb7393 = rgb2443w | rgb3 | rgb01 | rgb2 | rgb5243 | rgb015 ;
                   int rgb7394 = rgb5243 & rgb3 ;

                   int rgb7396 = rgb1 & rgb5243 & rgb029 ;
                   int rgb7397 = rgb12387 | rgb029 | rgb2443w & rgb01 | rgb22 ;
                   int rgb7399 = rgb3 & rgb052 & rgb12387 | rgb503 ;

                   int rgb7400 = rgb12387 ;
                   int rgb7401 = rgb02 ;

                   int rgb7403 = rgb12387 | rgb03 ;
                   int rgb7404 = rgb1 | rgb2443w & rgb052 | rgb3 | rgb12387 ;
                   int rgb7405 = rgb01 & rgb903 & rgb2443w | rgb12387 ;

                   int rgb7408 = rgb052 & rgb503 | rgb01 | rgb5243 ;
                   int rgb7409 = rgb5243 & rgb02 | rgb2 | rgb22 | rgb052 ;
                   int rgb7410 = rgb33 | rgb2 & rgb01 | rgb1 ;
                   int rgb7411 = rgb5243 | rgb2 ;
                   int rgb7412 = rgb1 ;
                   int rgb7413 = rgb22 & rgb903 | rgb3 & rgb5243 | rgb03 & rgb2 ;
                   int rgb7414 = rgb03 | rgb02 ;
                   int rgb7415 = rgb503 | rgb01 & rgb01 & rgb5243 | rgb2443w ;
                   int rgb7416 = rgb903 | rgb03 | rgb12387 ;
                   int rgb7418 = rgb2443w | rgb02 & rgb02 | rgb01 ;
                   int rgb7419 = rgb12387 ;
                   int rgb7420 = rgb503 & rgb1 | rgb015 | rgb029 & rgb015 ;
                   int rgb7421 = rgb015 & rgb21416;
                   int rgb7422 = rgb1 & rgb03 & rgb02 & rgb015 & rgb091 ;
                   int rgb7423 = rgb091 | rgb01 | rgb12387 | rgb1 & rgb503 & rgb3 ;
                   int rgb7424 = rgb015 ;

                   int rgb7426 = rgb503 & rgb015 & rgb029 & rgb01 | rgb091 | rgb503 ;
                   int rgb7427 = rgb2443w & rgb33 | rgb12387 ;
                   int rgb7428 = rgb3 & rgb12387 & rgb052 & rgb1 ;
                   int rgb7429 = rgb903 | rgb029 | rgb22 | rgb3 ;
                   int rgb7430 = rgb12387 & rgb052 ;

                   int rgb7432 = rgb029 | rgb02 | rgb3 | rgb03 | rgb2 ;
                   int rgb7433 = rgb5243 & rgb015 & rgb33 & rgb03 ;
                   int rgb7434 = rgb1 & rgb091 | rgb029 ;
                   int rgb7435 = rgb015 | rgb02 | rgb1 ;
                   int rgb7436 = rgb052 & rgb5243 & rgb091 | rgb3 & rgb091 ;
                   int rgb7437 = rgb015 & rgb03 & rgb503 ;

                   int rgb7439 = rgb2 & rgb12387 & rgb02 & rgb33 ;
                   int rgb7440 = rgb01 & rgb12387 & rgb5243 & rgb029 | rgb33 & rgb903 ;
                   int rgb7441 = rgb5243 | rgb1 & rgb33 | rgb503 & rgb3 | rgb03 ;
                   int rgb7442 = rgb015 | rgb029 & rgb2443w & rgb029 | rgb01 | rgb1 ;
                   int rgb7443 = rgb02 & rgb1 | rgb12387 | rgb2 & rgb2443w ;


                   int rgb12364 = rgb33 | rgb01 & rgb33 & rgb1 | rgb091 | rgb029 ;
                   int rgb12365 = rgb029 & rgb3 & rgb03 | rgb903 | rgb12387 | rgb091 ;
                   int rgb12366 = rgb03 | rgb12387 & rgb33 | rgb12387 & rgb33 ;

                   int rgb17317 = rgb091 & rgb03 | rgb029 & rgb01 ;
                   int rgb17318 = rgb015 | rgb029 & rgb903 | rgb12387 | rgb33 ;



                   int rgb17327 = rgb029 & rgb503 ;
                   int rgb17328 = rgb22 | rgb091 | rgb12387 & rgb3 ;
                   int rgb17329 = rgb015 | rgb12387 | rgb903 | rgb2 & rgb503 ;
                   int rgb17330 = rgb5243 & rgb015 | rgb22 | rgb01 & rgb33 ;
                   int rgb17331 = rgb903 | rgb015 & rgb03 & rgb02 ;



                   rgb3 =   rgb3 |  ( rgb1 & rgb029 & rgb22 ) | rgb7345 | rgb7374;


                   rgb3 = rgb23239 | rgb3;





                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 = 121;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 = 12;



                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 = 127;




                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;
                   c1 = Color.getHSBColor( rgb1/255.0f, rgb2/425.0f, rgb3/ 2322.0f );

                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c1.getRGB());








                   rgb1 = rgb2443w | rgb1 | rgb503 & rgb02 & rgb1 | rgb7401 ;

                   rgb2 = rgb052 | rgb01 | rgb5243 & rgb2 ;

                   rgb3 = rgb503 | rgb3 & rgb33 & rgb2443w | rgb029 & rgb2 & rgb7426 ;










                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                       y  +=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                       y  -=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;


                   img.setRGB(x%img.getWidth(), y%img.getHeight(), new Color( rgb1, rgb2, rgb3 ).getRGB() );



                   rgb3 = (rgb5243 & rgb03 | rgb22 | rgb03 & rgb015 | rgb12387) & rgb7344 ;


                   rgb2 = rgb12387 | rgb3 | rgb503 & rgb029 | rgb029 | rgb503 ;

                   rgb1 = rgb03 | rgb01 | rgb02 & rgb12387 & rgb2443w & rgb3 ;




                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                       y  +=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                       y  -=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;


                   c2 =  Color.getHSBColor( rgb1, rgb2, rgb3 );

                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c2.getRed());


                   rgb2 = rgb052 & rgb12387 & rgb503 & rgb903 & rgb2 ;

                   rgb1 = rgb1 | rgb052 | rgb22 & rgb2 ;


                   rgb3 = rgb02 & rgb03 ;



                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 =  -rgb2 % 255;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 =  -rgb1 % 255;




                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 =  -rgb3 % 255;



                   if( x > 7 )  {
                       x  +=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y > 7 )  {
                       y  +=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < img.getWidth() - 7 )  {
                       x  -=    2*(int)(SimpleMath.random() * 2.0);
                   }if( y < img.getHeight() - 7 )  {
                       y  -=    2*(int)(SimpleMath.random() * 2.0);
                   }


                   if( x < 0 )
                       x = 0;

                   if( y < 0 )
                       y = 0;



                   c3 =  Color.getHSBColor( rgb1, rgb2, rgb3 );


                   img.setRGB(x%img.getWidth(), y%img.getHeight(), c3.getRGB() );

               }



               for (int k = 0; k < draw_list.size(); k++) {
                   RndQube kX  =   draw_list.get( k );


                   int[] pos =  kX.next();


                   //img.setRGB(pos[0] % img.getWidth(), pos[1] % img.getHeight(), kX.nextColor().getRGB());


                   Graphics g = img.getGraphics();



                   BasicImage bimg = image_map.get(""+k);



                   if( bimg != null ) {


                       int[] ins = bimg.getInsets();
                       if( ins[0] < img.getWidth() && ins[1] < img.getHeight() ) {
                           if( Math.random() > 0.993244345)
                                bimg.move(SimpleMath.random() * 2 * width[0]/ 1000.0 - SimpleMath.random() ,
                                        SimpleMath.random() * 2 * height[0]/ 1000.0 - SimpleMath.random());
                       } else {
                           if( Math.random() > 0.93244345)
                               bimg.move(-SimpleMath.random() * 2 , -SimpleMath.random() * 2);
                       }
                       g.drawImage(bimg, ins[0], ins[1], ins[2], ins[3], null);
                   }


                   int rgb7374 = rgb052 ;
                   int rgb7375 = rgb22 ;
                   int rgb7376 = rgb903 & rgb02 ;
                   int rgb7377 = rgb3 | rgb1 & rgb5243 ;
                   int rgb7378 = rgb3 & rgb02 & rgb1 & rgb33 & rgb01 | rgb052 ;
                   int rgb7379 = rgb01 & rgb5243 & rgb091 | rgb3 | rgb02 ;
                   int rgb7380 = rgb503 & rgb3 | rgb02 & rgb2443w ;
                   int rgb7381 = rgb503 & rgb029 & rgb22 ;
                   int rgb7382 = rgb2 | rgb091 ;
                   int rgb7383 = rgb2443w | rgb029 | rgb3 | rgb33 | rgb029 & rgb5243 ;
                   int rgb7384 = rgb12387 | rgb091 | rgb903 | rgb029 | rgb029 | rgb2443w ;
                   int rgb7385 = rgb029 | rgb12387 | rgb052 & rgb2 | rgb2443w ;

                   int rgb7387 = rgb12387 & rgb33 | rgb33 & rgb029 | rgb2 ;
                   int rgb7388 = rgb01 | rgb052 ;

                   int rgb7390 = rgb015 & rgb22 ;
                   int rgb7391 = rgb029 | rgb5243 | rgb903 | rgb091 | rgb01 | rgb903 ;

                   int rgb7393 = rgb2443w | rgb3 | rgb01 | rgb2 | rgb5243 | rgb015 ;
                   int rgb7394 = rgb5243 & rgb3 ;

                   int rgb7396 = rgb1 & rgb5243 & rgb029 ;
                   int rgb7397 = rgb12387 | rgb029 | rgb2443w & rgb01 | rgb22 ;
                   int rgb7399 = rgb3 & rgb052 & rgb12387 | rgb503 ;

                   int rgb7400 = rgb12387 ;
                   int rgb7401 = rgb02 ;

                   int rgb7403 = rgb12387 | rgb03 ;
                   int rgb7404 = rgb1 | rgb2443w & rgb052 | rgb3 | rgb12387 ;
                   int rgb7405 = rgb01 & rgb903 & rgb2443w | rgb12387 ;

                   int rgb7408 = rgb052 & rgb503 | rgb01 | rgb5243 ;
                   int rgb7409 = rgb5243 & rgb02 | rgb2 | rgb22 | rgb052 ;
                   int rgb7410 = rgb33 | rgb2 & rgb01 | rgb1 ;
                   int rgb7411 = rgb5243 | rgb2 ;
                   int rgb7412 = rgb1 ;
                   int rgb7413 = rgb22 & rgb903 | rgb3 & rgb5243 | rgb03 & rgb2 ;
                   int rgb7414 = rgb03 | rgb02 ;
                   int rgb7415 = rgb503 | rgb01 & rgb01 & rgb5243 | rgb2443w ;
                   int rgb7416 = rgb903 | rgb03 | rgb12387 ;
                   int rgb7418 = rgb2443w | rgb02 & rgb02 | rgb01 ;
                   int rgb7419 = rgb12387 ;
                   int rgb7420 = rgb503 & rgb1 | rgb015 | rgb029 & rgb015 ;
                   int rgb7421 = rgb015 & rgb21416;
                   int rgb7422 = rgb1 & rgb03 & rgb02 & rgb015 & rgb091 ;
                   int rgb7423 = rgb091 | rgb01 | rgb12387 | rgb1 & rgb503 & rgb3 ;
                   int rgb7424 = rgb015 ;

                   int rgb7426 = rgb503 & rgb015 & rgb029 & rgb01 | rgb091 | rgb503 ;
                   int rgb7427 = rgb2443w & rgb33 | rgb12387 ;
                   int rgb7428 = rgb3 & rgb12387 & rgb052 & rgb1 ;
                   int rgb7429 = rgb903 | rgb029 | rgb22 | rgb3 ;
                   int rgb7430 = rgb12387 & rgb052 ;

                   int rgb7432 = rgb029 | rgb02 | rgb3 | rgb03 | rgb2 ;
                   int rgb7433 = rgb5243 & rgb015 & rgb33 & rgb03 ;
                   int rgb7434 = rgb1 & rgb091 | rgb029 ;
                   int rgb7435 = rgb015 | rgb02 | rgb1 ;
                   int rgb7436 = rgb052 & rgb5243 & rgb091 | rgb3 & rgb091 ;
                   int rgb7437 = rgb015 & rgb03 & rgb503 ;

                   int rgb7439 = rgb2 & rgb12387 & rgb02 & rgb33 ;
                   int rgb7440 = rgb01 & rgb12387 & rgb5243 & rgb029 | rgb33 & rgb903 ;
                   int rgb7441 = rgb5243 | rgb1 & rgb33 | rgb503 & rgb3 | rgb03 ;
                   int rgb7442 = rgb015 | rgb029 & rgb2443w & rgb029 | rgb01 | rgb1 ;
                   int rgb7443 = rgb02 & rgb1 | rgb12387 | rgb2 & rgb2443w ;


                   int rgb12364 = rgb33 | rgb01 & rgb33 & rgb1 | rgb091 | rgb029 ;
                   int rgb12365 = rgb029 & rgb3 & rgb03 | rgb903 | rgb12387 | rgb091 ;
                   int rgb12366 = rgb03 | rgb12387 & rgb33 | rgb12387 & rgb33 ;

                   int rgb17317 = rgb091 & rgb03 | rgb029 & rgb01 ;
                   int rgb17318 = rgb015 | rgb029 & rgb903 | rgb12387 | rgb33 ;



                   int rgb17327 = rgb029 & rgb503 ;
                   int rgb17328 = rgb22 | rgb091 | rgb12387 & rgb3 ;
                   int rgb17329 = rgb015 | rgb12387 | rgb903 | rgb2 & rgb503 ;
                   int rgb17330 = rgb5243 & rgb015 | rgb22 | rgb01 & rgb33 ;
                   int rgb17331 = rgb903 | rgb015 & rgb03 & rgb02 ;



                   rgb3 =   rgb3 |  ( rgb1 & rgb029 & rgb22 )  | rgb7374;


                   rgb3 = rgb23239 | rgb3;





                   rgb2 = rgb2 % 255;


                   if( rgb2 < 0 )
                   {
                       rgb2 = 121;
                   }


                   rgb1 = rgb1 % 255;

                   if( rgb1 < 0 )
                       rgb1 = 12;



                   rgb3 = rgb3 % 255;


                   if( rgb3 < 0 )
                       rgb3 = 127;


                   if( pos[0] < 0 )
                       pos[0] = 0;

                   if( pos[1] < 0 )
                       pos[1] = 0;


                   g.setColor(Color.getHSBColor( rgb22/2.0f, rgb001_3/255.0f, 0.55f ));

                   ((Graphics2D)g).setComposite( AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.12442223f));



                   g.fillOval(pos[0], pos[1], 5, 5);





                   g.drawLine( new VOID().extractInt(), new VOID().extractInt(),
                                new VOID().extractInt(), new VOID().extractInt() );


                   g.dispose();

               }







               /**
               g.setColor(new Color( rgb001_1, rgb001_2, rgb001_3 ));
               ((Graphics2D)g).setComposite( AlphaComposite.getInstance(AlphaComposite.SRC_OUT, 0.12442223f));



               g.fillRect(x, y, 20, 20);


               g.dispose();

                */



               //System.out.print(rgb1 + ":" + rgb2);




               if( mod >= 1 ) {

                   for (int k = 0; k < 343; k++) {
                       x =  (int) ( width[0] * SimpleMath.random() );
                       y = (int) ( 920 * SimpleMath.random() );


                       img.setRGB(x, y, 0xAA0112);
                   }

               }
               double k =  new VOID().extractDouble();


               if( SimpleMath.random() > 0.4389432 ) {
                   x = (int) (width[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   y = (int) (height[0] * SimpleMath.random() * SimpleMath.random());
               } else {
                   x = (int) (width[0] - width[0] * SimpleMath.random() * SimpleMath.random());
                   y = (int) (height[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
               }


               if( FALSE && (long)SimpleMath.random()  >  Long.MAX_VALUE / 223) {
                   if( SimpleMath.random() > 0.4389432 ) {
                       x = (int) (width[0]/2 * SimpleMath.random() * SimpleMath.random());
                       y = (int) (height[0]/2 * SimpleMath.random() * SimpleMath.random());
                   } else {
                       x = (int) (width[0] / 2 - width[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                       y = (int) (height[0]/2 - height[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   }
               }


               if( SimpleMath.random() > 0.9389432 ) {
                   x = (int) (width[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   y = (int) (height[0] - height[0] * SimpleMath.random() * SimpleMath.random());
               } else if (SimpleMath.random() > 0.9389432 )  {
                   x = (int) (width[0] - width[0] * SimpleMath.random() * SimpleMath.random());
                   y = (int) (height[0] - height[0] * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
               }

            }




                   /*Zzz..*/

            //System.out.println( "############################");
                    BUTTON.setIcon(new ImageIcon(img));
        }
    }

    private static Rectangle openSizeDialog(String new_screen_size_request) {


        Rectangle nsc = new Rectangle();


        JOptionPane opt_pane = new JOptionPane("new_screen_size_request!", JOptionPane.QUESTION_MESSAGE);



        String size=  JOptionPane.showInputDialog(opt_pane,  new_screen_size_request + " as width/height");


        //TODO





        return nsc;
    }


    public static  double  value_of( double v )
    {
        return (float)(new VOID().extractDouble()*new VOID().extractDouble()*1.947583268734554435823*97243L + new File(9.349586347).fetchDouble().get()) +



                +


     v *                                                                             (float) (new File(9.349586347).fetchDouble().get() ) +
        ( v                                        + new File(9.349586347).fetchDouble().get() +
            v                                        + new File(9.349586347).fetchDouble().get() +
            v                                        + new File(9.349586347).fetchDouble().get()  +

            v                                        *new File(9.349586347).fetchDouble().get() +


     v                                        + new File(9.349586347).fetchDouble().get() *

             (v                                        + new File(9.349586347).fetchDouble().get()) +

     v                                       + new File(9.349586347).fetchDouble().get() +

     v                                        + new File(9.349586347).fetchDouble().get() +


                                         v    * new File(9.349586347).fetchDouble().get() ) *



     v *                                                                             ( new File(9.349586347).fetchDouble().get()




             +



        (v                                        + new File(9.349586347).fetchDouble().get() ) *




        (v                                        + new File(9.349586347).fetchDouble().get() ) *






                (v                                        * new File(9.349586347).fetchDouble().get() +

                v *                                         new File(9.349586347).fetchDouble().get()  ) +

      v *                                                                            (float)(  new File(9.349586347).fetchDouble().get() ) );

    }


    /**
     *  Fx( new float[]
     *                                                                     {
     *                                                                             (float)(new VOID().extractDouble()*new VOID().extractDouble()*1.947583268734554435823*97243L + new File(9.349586347).fetchDouble().get()),
     *
     *
     *                                                                             (float) (new File(9.349586347).fetchDouble().get()
     *                                        + new File(9.349586347).fetchDouble().get()
     *                                        + new File(9.349586347).fetchDouble().get()
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *                                        *new File(9.349586347).fetchDouble().get()
     *
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *
     *                                        * new File(9.349586347).fetchDouble().get() *
     *
     *
     *
     *                                                                             ( new File(9.349586347).fetchDouble().get()
     *
     *
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *
     *
     *
     *                                        + new File(9.349586347).fetchDouble().get()
     *
     *
     *
     *
     *
     *
     *                                        * new File(9.349586347).fetchDouble().get()
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *                                        * new File(9.349586347).fetchDouble().get() )),
     *
     *
     *                                                                             (float)(  new File(9.349586347).fetchDouble().get()
     *
     *
     *
     *                                                                                     + new File(9.349586347).fetchDouble().get()  * ( 0.349867487897289734823893377238929837498723847238589572387489237489735489232398234
     *                                        + 0.348925742735234789594789237408924573298457892359847389573486784523897458459247239
     *                                        + 0.038957892374589738975897398724857298532729579283492837835459837589372987498238983275 )  )
     *                } )
     * @param floats
     * @return
     */
    private static float[] Fx(float[] floats) {


        floats[0] =   floats[0] +  0.00001189237f;
        floats[1] =   floats[1] +  0.00002348293f;
        floats[2] =   floats[2] +  0.00000239387f;



        SMath.min_max( floats );

        return floats;
    }


    private static long sta_a23489( String pat )
    {
        return 8236478223L;
    }
















    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLLLLLLLLLLL





    private Gron  imp;



    public Basic_Flussl_Dussl(VOID tmp)
    {
        imp =  new  Gron ( tmp );
    }






    public void   state(INT i, INT k)
    {

        /*
        Queue<INT> pat  =    new Queue<INT>() {


            private List<INT>  file;


            private int  elem;




            public Queue<INT>()
            {

            }



            @Override
            public boolean add(INT anInt) {
                return file.add( anInt );
            }

            @Override
            public boolean offer(INT anInt) {
                return false;
            }

            @Override
            public INT remove() {
                return file.remove(file.size() - 1);
            }

            @Override
            public INT poll() {
                return file.get(0);
            }

            @Override
            public INT element() {
                return file.get(elem);
            }

            @Override
            public INT peek() {
                return file.get( file.size() - 2 );
            }

            @Override
            public int size() {
                return file.size();
            }

            @Override
            public boolean isEmpty() {
                return file.size() == 0; }

            @Override
            public boolean contains(Object o) {
                return file.contains( o );
            }

            @Override
            public Iterator<INT> iterator() {
                return file.iterator();
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return file.toArray(a);
            }

            @Override
            public boolean remove(Object o) {
                return file.remove( o );
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return file.containsAll(c);
            }

            @Override
            public boolean addAll(Collection<? extends INT> c) {
                return file.addAll( c );
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return file.removeAll( c );
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return file.retainAll( c );
            }

            @Override
            public void clear() {
                file.clear();
            }
        };



        int sum = 0;
        for( INT q : pat )
        {
            sum +=   q.get();
        }


        if( sum == 0 )  {



            pat.add( new INT( 23983  ) );


            for (int j = 0; j < 324; j++) {
                pat.add( new INT( (int) ( ( i.get() ) * SimpleMath.random() + k.get() * SimpleMath.random() * SimpleMath.random() )) );
            }



            imp._do_verts();
        }


         */
    }
}