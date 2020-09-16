/*
 * class that implements TrailerType
 */

public class TravelTrailer implements TrailerType {
    @Override
    public int getAxels() {
        return 0;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public Type getType() {
        return Type.TravelTrailer;
    }
}
