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



        frame.setSize(1919, 979);



        JButton BUTTON =  new JButton();


        BufferedImage img = new BufferedImage( 1920, 980, BufferedImage.TYPE_INT_ARGB );



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
        frame.setVisible(true);








        List<RndQube> draw_list = new ArrayList<>();





        draw_list.add(new SimpleRandomRect(0.0, 0.0, 1920, 980, 2.5));


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


                if( click_count[0] % 2 == 1 )
                {
                    draw_list.add( new SimpleRandomRect(lxc_x[0], lxc_y[0], e.getX() - lxc_x[0], e.getY() - lxc_y[0], 3.1415 ));
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
                   rgb2 = 255;
               }


               rgb1 = rgb1 % 255;

               if( rgb1 < 0 )
                   rgb1 = 121;



               rgb3 = rgb3 % 255;


               if( rgb3 < 0 )
                   rgb3 = 91;

               img.setRGB(x, y, new Color( rgb1, rgb2, rgb3 ).getRGB() );








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


               img.setRGB(x%img.getWidth(), y%img.getHeight(), new Color( rgb1, rgb2, rgb3 ).getRGB() );


               for (int k = 0; k < draw_list.size(); k++) {
                   RndQube kX  =   draw_list.get( k );


                   int[] pos =  kX.next();


                   //img.setRGB(pos[0] % img.getWidth(), pos[1] % img.getHeight(), kX.nextColor().getRGB());
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
                       x =  (int) ( 1920 * SimpleMath.random() );
                       y = (int) ( 920 * SimpleMath.random() );


                       img.setRGB(x, y, 0xAA0112);
                   }

               }
               double k =  new VOID().extractDouble();


               if( SimpleMath.random() > 0.4389432 ) {
                   x = (int) (1920 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   y = (int) (980 * SimpleMath.random() * SimpleMath.random());
               } else {
                   x = (int) (1920 - 1920 * SimpleMath.random() * SimpleMath.random());
                   y = (int) (980 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
               }


               if( FALSE && (long)SimpleMath.random()  >  Long.MAX_VALUE / 223) {
                   if( SimpleMath.random() > 0.4389432 ) {
                       x = (int) (1920/2 * SimpleMath.random() * SimpleMath.random());
                       y = (int) (980/2 * SimpleMath.random() * SimpleMath.random());
                   } else {
                       x = (int) (1920 / 2 - 1920 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                       y = (int) (440 - 980 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   }
               }


               if( SimpleMath.random() > 0.9389432 ) {
                   x = (int) (1920 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
                   y = (int) (980 - 980 * SimpleMath.random() * SimpleMath.random());
               } else if (SimpleMath.random() > 0.9389432 )  {
                   x = (int) (1920 - 1920 * SimpleMath.random() * SimpleMath.random());
                   y = (int) (980 - 980 * SimpleMath.random() * SimpleMath.random() * SimpleMath.random());
               }

            }




                   /*Zzz..*/

            //System.out.println( "############################");
                    BUTTON.setIcon(new ImageIcon(img));
        }
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