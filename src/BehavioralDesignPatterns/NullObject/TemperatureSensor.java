package BehavioralDesignPatterns.NullObject;

/**
 * A class that has a dependency on a FunctionalityExpander, so in this scenario we can feed it with
 * a NullObject.
 * @author Vitomir M
 */
public class TemperatureSensor {
    private double currentCelsiusTemperature;
    private FunctionalityExpander functionalityExpander;

    public TemperatureSensor(FunctionalityExpander functionalityExpander){
        this.functionalityExpander = functionalityExpander;
    }

    public void updateTemperature(double measuredCelsiusTemp){
        this.currentCelsiusTemperature = measuredCelsiusTemp;
        System.out.format("Currently measured %.2f°C\n",measuredCelsiusTemp);
        //if we do not provide an actual object, the NullPointerException will be thrown
        functionalityExpander.expandFunctionality(measuredCelsiusTemp);
    }
}
