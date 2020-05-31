package StructuralDesignPatterns.Adapter;

/**
 *Using the adapter interface the Fahrenheit melting point was converted to Celsius.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        Meltable iron = new Iron();
        System.out.format("The iron melts at %.2f°F\n", iron.getMeltingPoint());
        MeltableAdapter ironAdapter = new MeltableAdapterImpl(iron);
        System.out.format("The iron melts at %.2f°C ", ironAdapter.getMeltingPoint());
    }
}
