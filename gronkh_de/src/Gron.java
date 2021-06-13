import rnd_pk.aoiew_awei;
import scr.INT;
import scr.VOID;




public class Gron {



    private aoiew_awei awm,  px,  py,  pz;





    private double[][]   vert1;






    private double[][] vert23;



    public Gron( VOID  v )
    {
        awm = new aoiew_awei( v, null );


        py = new aoiew_awei( v,   null ) ;

        px = new aoiew_awei( v,  null );
        pz = new aoiew_awei( v, null );



        vert1 = new double[23982][24];

        vert23 = new double[2938][232];
    }

    public INT _do_verts() {


        if( px.equals( py ) || py.equals( pz ) )  {

            vert1[0][1] =  px.fetch();

            vert23[0][2] = pz.fetch();



            for(int i = 0; i < 2938; ++i)
            {
                vert23[0][0] = new VOID( ).extractDouble();

                for( int j = 0; j < 232; ++j ) {
                    vert23[i][j] = new VOID().extractInt();
                }

            }


        }

        return new INT( (int)vert23[0][new INT(243).get()] );
    }
}
