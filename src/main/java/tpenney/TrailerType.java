/*
 * Interface that will return the folowing methods
 *
 * getAxels(): will return the number of axels on the camper
 * getLength(): will return the length of the camper
 * getWeight(): will return the weight of the camper
 * getType(): will return the Type of the camper from enum Type
 *
 */


public interface TrailerType {
    int getAxels();
    int getLength();
    int getWeight();
    Type getType();
}
