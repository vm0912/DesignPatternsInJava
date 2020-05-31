package CreationalDesignPatterns.Prototype.UsingCopyConstructors;
import CreationalDesignPatterns.Prototype.UsingCloneable.Transmission;

public class Car {
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

    public Car(Car other){
        this.manufacturer = other.manufacturer;
        this.model = other.model;
        this.doorNumber = other.doorNumber;
        this.seatNumber = other.seatNumber;
        this.kilometersPassed = other.kilometersPassed;
        this.maxSpeed = other.maxSpeed;
        this.transmission = other.transmission;
        this.gps = new GPS(other.gps);
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
