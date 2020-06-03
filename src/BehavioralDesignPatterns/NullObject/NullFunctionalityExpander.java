package BehavioralDesignPatterns.NullObject;

/**
 * A concrete class that implements FunctionalityExpander interface, but provides stub methods in order to
 * avoid adding null references (NullObject).
 * @author Vitomir M
 */
public class NullFunctionalityExpander implements FunctionalityExpander {
    @Override
    public void expandFunctionality(double celsiusTemperature) {

    }
}
