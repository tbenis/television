/**
 * Author: Benis Tambe
 * 07/29/2021
 */

public class Television {
    private final String MANUFACTURER;
    private final int SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * Television Paramerterized Constructor that takes in two arguments and default values for the remaining class variables
     * @param brand
     * @param size
     */

    public Television(String brand, int size){
        MANUFACTURER = brand;
        SIZE = size;
        volume = 20;
        channel = 2;
        powerOn = false;
    }

    /**
     * setChannel method is a setter method
     * @param station
     */
    public void setChannel(int station){
        channel = station;
    }

    /**
     * turns on TV
     */
    public void power(){
        powerOn = !powerOn;
    }

    /**
     * Adds one to current volume value
     */
    public void increaseVolume(){
        volume = volume+1;
    }

    /**
     * Subtracts one from current volume value
     */
    public void decreaseVolume(){
        volume = volume-1;
    }

    /**
     * getChannel - getter method that returns an int value
     * @return
     */
    public int getChannel() {
        return channel;
    }
    /**
     * getVolume - getter method that returns an int value
     * @return
     */
    public int getVolume() {
        return volume;
    }
    /**
     * getManufacturer - getter method that returns a String value
     * @return
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }
    /**
     * getScreenSize - getter method that returns an int value
     * @return
     */
    public int getScreenSize() {
        return SIZE;
    }
}
