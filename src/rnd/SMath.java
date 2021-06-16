package rnd;

public class SMath {


    public static void min_max( float[] v )

    {
        for( int i = 0;  i <  v.length; ++i ) {
            while( v[i] > 1.0 ) {
                v[i] -= 1.0;
            } while( v[i] < 0.0 ) {
                v[i] += 1;
            }
        }
    }

    public static void min_max(int[] p, int[] min, int[] max) {

        for (int i = 0; i < p.length; i++) {
            if( p[i] < min[i] )
                p[i] = min[i];
            if( p[i] >= max[i] )
                p[i] = max[i] - 1;
        }
    }
}
