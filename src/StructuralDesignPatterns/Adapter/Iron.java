package StructuralDesignPatterns.Adapter;

public class Iron implements Meltable {

    @Override
    public double getMeltingPoint() {
        return 2800.4;
    }
}
