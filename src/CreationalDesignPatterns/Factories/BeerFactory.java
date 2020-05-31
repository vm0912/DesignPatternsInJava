package CreationalDesignPatterns.Factories;

public class BeerFactory implements DrinkableFactory {
    @Override
    public Drinkable order() {
        System.out.println("Bartender: 'Enjoy your beer!'");
        return new Beer();
    }
}
