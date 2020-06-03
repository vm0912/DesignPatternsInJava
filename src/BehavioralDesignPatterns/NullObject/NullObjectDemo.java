package BehavioralDesignPatterns.NullObject;

/**
 *A Null Object design pattern represents a no-op object that conforms to the required interface,
 * satisfying a dependency requirement of some other object. It is mainly done to avoid null pointer exceptions.
 * @author Vitomir M
 */
public class NullObjectDemo {
    public static void main(String[] args) {
        FunctionalityExpander expander = new FahrenheitUnitProvider();
        //not valid, will provide NullPointerException
//        TemperatureSensor temperatureSensor = new TemperatureSensor(null);
        TemperatureSensor temperatureSensor = new TemperatureSensor(expander);
        temperatureSensor.updateTemperature(26.0);

        System.out.println("--------------------------------------");
        //new sensor object referencing a nullObject
        TemperatureSensor temperatureSensor2 = new TemperatureSensor(new NullFunctionalityExpander());
        temperatureSensor2.updateTemperature(30.00);


    }
}
