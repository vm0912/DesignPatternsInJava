package CreationalDesignPatterns.Prototype.UsingCloneable;

import java.util.Arrays;

public class GPS implements Cloneable {
    private String manufacturer, model;
    private String[] savedLocations;

    public GPS(String manufacturer, String model, String[] savedLocations) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.savedLocations = savedLocations;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
         return new GPS(manufacturer, model,savedLocations.clone());
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSavedLocations(String[] savedLocations) {
        this.savedLocations = savedLocations;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", savedLocations=" + Arrays.toString(savedLocations) +
                '}';
    }
}
