/*
 * Interface that will return the folowing methods
 *
 * getCapacity(): how many people the camper can sleep
 *
 * getBunks(): bollean value if bunks are present in the camper
 *      true = There are bunks
 *      false = There are not bunks
 *
 * getBed(): returns value from Bed enum
 */

public interface Beds {

    int getCapacity();

    boolean getBunks();

    Bed getBed();
}
