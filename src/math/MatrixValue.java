package math;

import scr.DOUBLE;

public class MatrixValue extends Number
                        implements IMv
{



    private double value;


    private double deriv;



    private  double[]  p;






    public MatrixValue( double v )
    {
        this.value = v;
    }
    @Override
    public int intValue() {
        return (int) value;
    }

    @Override
    public long longValue() {
        return (long) value;
    }

    @Override
    public float floatValue() {
        return (float) value;
    }

    @Override
    public double doubleValue() {
        return value;
    }


    public DOUBLE fetchDoubleValue()
    {
        return new DOUBLE(doubleValue());
    }

    @Override
    public IMv add(IMv other) {
        return new MatrixValue(doubleValue() + other.fetchDoubleValue().get() );
    }

    @Override
    public IMv mult(IMv other) {
        return new MatrixValue( doubleValue() + other.fetchDoubleValue().get() );
    }
}
