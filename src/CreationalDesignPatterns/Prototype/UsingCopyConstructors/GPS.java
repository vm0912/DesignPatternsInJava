package CreationalDesignPatterns.Prototype.UsingCopyConstructors;

import java.util.Arrays;

public class GPS  {
    private String manufacturer, model;
    private String[] savedLocations;

    public GPS(String manufacturer, String model, String[] savedLocations) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.savedLocations = savedLocations;
    }
    public GPS(GPS other){
        this.manufacturer = other.manufacturer;
        this.model = other.model;
        this.savedLocations = Arrays.copyOf(other.savedLocations, other.savedLocations.length);
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
