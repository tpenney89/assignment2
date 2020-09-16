/*
 * class that implements Beds
 */

public class Queen implements Beds {
    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public boolean getBunks() {
        return false;
    }

    @Override
    public Bed getBed() {
        return Bed.Queen;
    }
}
