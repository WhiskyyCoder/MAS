package com.github.whiskyycoder;

import java.io.Serializable;

public class Engine implements Serializable{
    private int maxVolume;
    private String serialNumber;
    private int amountCylinders;

    public int getMaxVolume() {
        return maxVolume;
    }
    public int getAmountCylinders() {
        return amountCylinders;
    }
    public String getSerialNumber(){return serialNumber;}

    public Engine(int maxVolume, String serialNumber, int amountCylinders) {
        this.maxVolume = maxVolume;
        this.serialNumber = serialNumber;
        this.amountCylinders = amountCylinders;
    }

    @Override
    public String toString() {
        return "Engine serial no: "+getSerialNumber()+", volume: "+getMaxVolume()+", cylinders: "+getAmountCylinders();
    }
}
