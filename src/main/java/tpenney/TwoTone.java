/*
 * class that implements ColorScheme
 */

import java.awt.Color;

public class TwoTone implements ColorScheme {

    private Color color1, color2;

    public TwoTone(Color color1, Color color2){
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public Color getPrimaryColor() {
        return color1;
    }

    @Override
    public Color getSecondaryColor() {
        return color2;
    }
}
