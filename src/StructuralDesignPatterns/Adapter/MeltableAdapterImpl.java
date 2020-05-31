package StructuralDesignPatterns.Adapter;

public class MeltableAdapterImpl implements MeltableAdapter {

    private Meltable metal;

    public MeltableAdapterImpl(Meltable metal) {
        this.metal = metal;
    }

    @Override
    public double getMeltingPoint() {
        return convertFahrenheitToCelsius(metal.getMeltingPoint());
    }

    private double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32.0) / 1.8;
    }
}
