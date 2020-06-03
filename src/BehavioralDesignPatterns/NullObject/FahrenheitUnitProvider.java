package BehavioralDesignPatterns.NullObject;

public class FahrenheitUnitProvider implements FunctionalityExpander {
    @Override
    public void expandFunctionality(double celsiusTemperature) {
        System.out.format("%.2f°C = %.2f°F",celsiusTemperature, (celsiusTemperature*1.8 + 32.0));
    }
}
