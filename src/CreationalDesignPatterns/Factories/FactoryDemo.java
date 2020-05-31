package CreationalDesignPatterns.Factories;

/**
 *A simple demonstration of the abstract factory pattern in the pub scenario.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Bartender john = new Bartender();
        john.greet();
        Drinkable drink = john.getOrder();
        drink.drink();
    }
}
