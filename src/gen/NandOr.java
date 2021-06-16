package gen;


import rnd_math.MATH;
import rnd_math.SimpleMath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class NandOr {


    private static int aawe2372389 =  239;


    private static int aweoif239832728 =  298372837;
    private static int aweoif239832778 =  298372837;
    private static int aweoif2398323728 =  298372837;
    private static int aweoif239823228 =  298372837;
    private static int aweoif239823328 =  298372837;
    private static int aweoif232332328 =  298372837;







    private static int  value(  int x, int y )
    {
        return (int)(MATH.rand_x() * x) * (int)( MATH.rand_xy() - x*y + x )
                +  (int)(MATH.rand_x() * y) * (int)( MATH.rand_xy() - x*y + y );
    }




    private static List<String> var_names;



    private static String[]  separators;






    public static void  register_var_names( String[] names )
    {
        var_names = new ArrayList<>();


        for (int i = 0; i < names.length; i++) {
            var_names.add( names[i] );
        }
    }



    public static void   set_reg_sep( String[] s_e_p )
    {
        separators = s_e_p;
    }


    /**
     *
     *
     *
     * @param nvn NAME OF VARIABLE
     * @param c  COUNT OF COMBINATION
     * @return LINE TO ADD TO THE SCRIPT
     */
    public static String next_line( String nvn, int c )
    {
        int[] v  = new int[c];


        for(int i = 0; i < c; ++i) {
            v[i] = SimpleMath.abs(  value( 232, 34895 ) ) % var_names.size();
        }



        String line = "";



        line +=   "int "  +  nvn  +    " = ";

        for (int i = 0; i < v.length; i++) {
            line += var_names.get( v[i] ) + ' ';


            if( i + 1 < v.length)
                line +=  fts_sep( ) +  " ";
        }



        return line + ";";
    }




    /*
    alkejwaiofej 4 awepofa wijaweoifa
    aw efoawjefawe
    f iawj efoiajw efda
    wf eeawef
    aw efaw efja wdiofj a
    wef awpj32jj 23io23 o2i3j 2oj 3ij23 j
    3 23oj23 oi3j 23ji23j23 j23j23
    23 23p j23oj23 2ni2unqaijqijq
    q23 o2#
    q23 jq2323oqi
    q3 qi3oqq
     q2poq 23j q2
      23jq2o
     */




    public static void main( String[] args )
    {

        String[] params =  new String[] {
         "rgb1",
        "rgb2",
         "rgb3",


          "rgb01",
          "rgb02",
          "rgb03",





         "rgb22",

          "rgb33",


                "rgb091",
                "rgb029",
                "rgb903",

        "rgb015",
        "rgb052",
         "rgb503",



        "rgb12387",
            "rgb2443w",
        "rgb5243"
        };




        register_var_names(params);
        set_reg_sep(new String[]{"&", "|"});


        for (int i = 15; i < 23243; i++) {
            System.out.println( next_line("rgb" + i, (int)(Math.random()*7) ) );
        }
    }



    private static String fts_sep()
    {
        return separators[ (int)(Math.random()*separators.length)];
    }

}
