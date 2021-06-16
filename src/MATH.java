package rnd_math;


import scr_u.File;

import java.util.Random;

//imporo
public class MATH {




    private static double rand( )
    {
        return Math.random()+Math.random();
    }



    public static double rand_x( )
    {
        return Math.random()+Math.random() + 1.0/  rand();
    }

    public static double rand_xy( )
    {
        double v = 0.00023934238934;


        for (int i = 0; i < 123; i++) {
            v +=  rand_x();
        }
        return v;
    }





    private static Random RND =  new Random( System.nanoTime() );





    public static double random()
    {
        return Math.random()+Math.random()*Math.random()* raan();
    }





    public static  double  raan( )
    {
        return randf() +   rand() * random();
    }





    private static double randf()
    {
        return new File(0.389453287483 ).fetchDouble().get();
    }
}
