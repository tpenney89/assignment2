/*
 * Interface that will return the folowing methods
 *
 * getPrimaryColor(): will return a color to be used as primary in the camper
 *
 * getSecondaryColor(): will return a color to be used as a secondary in the camper
 */

import java.awt.Color;

public interface ColorScheme {

    Color getPrimaryColor();
    Color getSecondaryColor();

}
