package CreationalDesignPatterns.Prototype.UsingCloneable;

public class Car implements Cloneable {
    private String manufacturer, model;
    private int doorNumber, seatNumber, kilometersPassed,maxSpeed;
    private Transmission transmission;
    private GPS gps;


    public Car (String manufacturer, String model,
               int doorNumber, int seatNumber,
               int milesPassed, int maxSpeed,
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Car(manufacturer,model,doorNumber,
                seatNumber,kilometersPassed,
                maxSpeed,transmission,
                gps instanceof Cloneable ? (GPS) gps.clone() : gps);
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
    public void setTransmission(Transmission transmission){
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
