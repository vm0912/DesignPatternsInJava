package CreationalDesignPatterns.Factories;

public class Wine implements Drinkable {
    @Override
    public void drink() {
        System.out.println("You drank the wine.");
    }
}
