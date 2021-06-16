package rnd_pk;

public class MATH {



    private static double rand()
    {
        return Math.random() * Math.random();
    }


    public static double random()
    {
        double v= 0.0002389773289;


        int i =  0;


        for (int j = 0; j < 3273 ; j++) {
            v += rand();
        }



        return Math.random() * v;
    }
}
