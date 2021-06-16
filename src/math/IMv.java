package math;


import scr.DOUBLE;
public interface IMv {








    DOUBLE   fetchDoubleValue( );

    /**
     *  ADD ANOTHER  MATRIX
     * @param other THE MATIX TO ADD
     * @return
     */

    IMv  add(  IMv  other );

    /**
     *   multiply two IMv´s
     * @param other  the other opponent
     * @return  the Matrix-Multiply   extract value
     */
    IMv   mult( IMv  other );






}
