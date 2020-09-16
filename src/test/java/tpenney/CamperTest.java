package tpenney;

import org.junit.Test;

import java.awt.Color;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class CamperTest {

    @Test
    public void testNegative() {
        fail("broken");
    }

    @Test
    public void testConstructions() {
        TwoToneExterior colorScheme = new TwoToneExterior(Color.BLACK, Color.BLUE);
        Camper camper = new Camper(colorScheme);
        assertEquals("verify camper constrution",colorScheme ,camper.getColorScheme());
    }
}
