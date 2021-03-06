package rnd_form;



import rnd_math.SimpleMath;

import java.awt.*;


public abstract class RndQube
{




    private static int   rnd_qube_count = 0;





    private String name;





    private double  originX, originY;


    private double  width,  height;







    private  double eOffset,  x, y;

    private double  exp;






    private  double   v1, v2, v3;






    private int[]   lxt;




    public RndQube( double ox, double oy,  double w, double h, double exp )
    {
        originX = ox;
        originY = oy;

        this.width = w;
        this.height = h;


        this.exp = exp;
    }








    protected  double nextX()
    {
        return  originX +   width *  Math.pow(  Math.pow( SimpleMath.random(),  __pow( exp ) ), 1.0 / __pow( exp ) );
    }




    protected double nextY()
    {
        return  originY +   height *  Math.pow( Math.pow( SimpleMath.random(),  __pow( exp ) ), 1.0 / __pow( exp ) );
    }


    public int[] next()
    {
        if( lxt == null ) {
            lxt = new int[] {
                    (int) Math.round( nextX() ),
                    (int) Math.round( nextY() )
            };
        }

        else {
            lxt[0] = (int) Math.round(nextX());
            lxt[1] = (int) Math.round(nextY());
        }


        return lxt;
    }






    public abstract Color[] nextColors( );



    protected double __pow( double e )
    {
        return exp;
    }
}
