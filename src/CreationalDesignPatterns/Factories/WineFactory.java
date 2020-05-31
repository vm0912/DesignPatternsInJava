package CreationalDesignPatterns.Factories;

public class WineFactory implements DrinkableFactory {
    @Override
    public Drinkable order() {
        System.out.println("Bartender: 'Enjoy your wine!'");
        return new Wine();
    }
}
