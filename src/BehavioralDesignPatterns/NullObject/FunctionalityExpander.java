package BehavioralDesignPatterns.NullObject;

/**
 * An interface that requires for the implementer to provide an additional functionality (to the sensor in our case).
 * Too much abstraction is used due to the fact the real functionality is not relevant for the NullObject demo.
 * @author Vitomir M
 */
public interface FunctionalityExpander {
    void expandFunctionality(double celsiusTemperature);
}
