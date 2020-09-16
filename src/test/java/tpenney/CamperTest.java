import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.awt.Color;

public class CamperTest {

    TrailerType trailerType;
    Beds beds;
    Color color1;
    Color color2;
    ColorScheme colorScheme;
    Camper myCamper;
    @Before
    public void setUpCamper(){
        this.trailerType = new TravelTrailer();
        this.beds = new Queen();
        this.color1 = Color.LIGHT_GRAY;
        this.color2 = Color.GRAY;
        this.colorScheme = new TwoTone(color1, color2);
        this.myCamper = new Camper(trailerType, beds, colorScheme);
    }


    @Test
    public void testCamperConstruction(){
        assertNotNull("testCamperConstruction failed", myCamper);
    }

    @Test
    public void getTrailerType() {
        assertEquals("Verify TrailerType is correct", this.trailerType, myCamper.getTrailerType());
    }

    @Test
    public void getBeds() {
        assertEquals("Verify Beds is correct", this.beds, myCamper.getBeds());
    }

    @Test
    public void getColorScheme() {
        assertEquals("Verify ColorScheme is correct", this.colorScheme, myCamper.getColorScheme());
    }
}
