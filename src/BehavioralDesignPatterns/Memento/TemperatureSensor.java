package BehavioralDesignPatterns.Memento;

public class TemperatureSensor {

    private int stateCounter;
    private double celsiusTemperature;

    public TemperatureSensor() {
        this.stateCounter = 0;
    }

    public int getStateCounter() {
        return stateCounter;
    }

    public void setStateCounter(int stateCounter) {
        this.stateCounter = stateCounter;
    }

    public double getCelsiusTemperature() {
        return celsiusTemperature;
    }

    public void setCelsiusTemperature(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    public Memento updateTemperature(double celsiusTemperature){
        
    }
}
