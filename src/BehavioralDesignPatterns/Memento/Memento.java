package BehavioralDesignPatterns.Memento;

/**
 * The Memento class stores the snapshot of the TemperatureSensor's state after its update.
 * The main purpose of this class is to provide the possibility to restore the state recorded.
 * @author Vitomir M
 */
public class Memento {

    private int stateCounter;
    private double celsiusTemperature;

    public Memento(int stateCounter, double celsiusTemperature) {
        this.stateCounter = stateCounter;
        this.celsiusTemperature = celsiusTemperature;
    }

    public int getStateCounter() {
        return stateCounter;
    }

    public double getCelsiusTemperature() {
        return celsiusTemperature;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "stateCounter=" + stateCounter +
                ", celsiusTemperature=" + celsiusTemperature +
                '}';
    }
}
