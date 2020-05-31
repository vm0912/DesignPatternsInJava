package CreationalDesignPatterns.Prototype.UsingSerialization;
import CreationalDesignPatterns.Prototype.UsingCloneable.Transmission;

import java.io.Serializable;


public class Car implements Serializable {
    private String manufacturer, model;
    private int doorNumber, seatNumber, kilometersPassed,maxSpeed;
    private Transmission transmission;
    private GPS gps;


    public Car (String manufacturer, String model,
               int doorNumber, int seatNumber,
               int kilometersPassed, int maxSpeed,
               Transmission transmission, GPS gps) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.doorNumber = doorNumber;
        this.seatNumber = seatNumber;
        this.kilometersPassed = kilometersPassed;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.gps = gps;
    }


    public void setModel(String model){
        this.model = model;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed= maxSpeed;
    }

    public GPS getGps() {
        return gps;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", doorNumber=" + doorNumber +
                ", seatNumber=" + seatNumber +
                ", kilometersPassed=" + kilometersPassed +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                ", \ngps=" + gps +
                '}';
    }

}
