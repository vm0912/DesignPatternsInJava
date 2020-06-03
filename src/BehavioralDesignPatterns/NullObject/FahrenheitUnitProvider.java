package BehavioralDesignPatterns.NullObject;

public class FahrenheitUnitProvider implements FunctionalityExpander {
    @Override
    public void expandFunctionality(double celsiusTemperature) {
        System.out.format("Added functionality: %.2f°C = %.2f°F\n",celsiusTemperature, (celsiusTemperature*1.8 + 32.0));
    }
}
