package BehavioralDesignPatterns.Memento;

/**
 * A TemperatureSensor class, which has the simple functionality of updating the current temperature
 * in degrees Celsius.
 * The Memento class is used to copy the state at the update of the sensor.
 * @author Vitomir M
 */
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
        this.celsiusTemperature = celsiusTemperature;
        return new Memento(++stateCounter, celsiusTemperature);
    }

    public void restoreState(Memento memento){
        this.stateCounter = memento.getStateCounter();
        this.celsiusTemperature = memento.getCelsiusTemperature();
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "stateCounter=" + stateCounter +
                ", celsiusTemperature=" + celsiusTemperature +
                '}';
    }
}
