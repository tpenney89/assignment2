/*
 * Camper class that constructs the interfaces using dependency injection to build a camper
 */


public class Camper {

    private TrailerType trailerType;
    private Beds beds;
    private ColorScheme colorScheme;

    public Camper(TrailerType trailerType, Beds beds, ColorScheme colorScheme) {
        this.trailerType = trailerType;
        this.beds = beds;
        this.colorScheme = colorScheme;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }

    public Beds getBeds() {
        return beds;
    }

    public ColorScheme getColorScheme() {
        return colorScheme;
    }
}
