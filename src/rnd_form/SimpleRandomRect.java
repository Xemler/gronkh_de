package rnd_form;

import color.ColorConstruct;
import com.sun.javafx.css.converters.ColorConverter;
import rnd_math.SimpleMath;

import java.awt.*;

public class SimpleRandomRect extends RndQube {




    private ColorConverter  converter;



    private ColorConstruct cc;



    public SimpleRandomRect(double ox, double oy, double w, double h, double exp) {
        super(ox, oy, w, h, exp);
    }

    @Override
    public Color[] nextColors() {
        int rgb1 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
        int rgb2 = (int) ( 255.0 * SimpleMath.random()* SimpleMath.random()  );
        int rgb3 = (int) ( 255.0 * SimpleMath.random()* (SimpleMath.random())  );








        return new Color[]{ new Color( rgb1, rgb2, rgb3 ) };
    }
}
