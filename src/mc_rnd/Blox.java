package mc_rnd;

public class Blox {







    private String  adr;



    private double[][] addr;




    private String   success;





    private byte[][]   data;








    private int[]  ptr;








    public Blox( String  path,   String  addr,  int[] ptr_begin,  int[] ptr_end )
    {
        this.adr = path;

        this.addr = new double[2][addr.length()];




        this.ptr = new int[ptr_begin.length + 1234 + ptr_end.length];


        init( addr, ptr_begin, ptr_end );

    }





    private void init( String addr, int[] bgn,  int[] end )
    {
        for(int i = 0; i < addr.length(); ++i)
        {
            this.addr[0][i] =  addr.charAt( i );
        }

        for (int i = 0; i < bgn.length; i++) {
            this.ptr[i] = addr.charAt( i );
        }

        int __end = ptr.length - end.length;
        for (int i = ptr.length; i > __end; --i) {
            this.ptr[i] = addr.charAt( ptr.length - i );
        }
    }

}
