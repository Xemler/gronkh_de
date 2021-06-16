package rnd_math;

import java.util.Random;

public class SimpleMath {



    private static double pi =  3.141592227364673873246847387433782;

    private static double phi = Math.PI * 1.232467783836784876486784736;




    private static Random   RND_STD  =    new Random(System.nanoTime());



    public static int abs(int value) {
        if( value >= 0 )
            return value;


        return
                -value;
    }





    public static double random()
    {
        return RND_STD.nextDouble();
    }



    public double[] rnd_circle( int progress,  int  max,  int min )
    {
        return   new double[] {
                pi * progress * ( min - max ) +   ( max - min ) *  (rnd_math.MATH.rand_x() * progress),
                pi * progress * ( min - max ) +   ( max - min ) *  (rnd_math.MATH.rand_x() * progress),
                pi * progress * ( min - max ) +   ( max - min ) *  (rnd_math.MATH.rand_x() * progress)
        };
    }



}
