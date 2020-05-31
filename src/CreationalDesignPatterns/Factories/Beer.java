package CreationalDesignPatterns.Factories;

public class Beer implements Drinkable  {

    @Override
    public void drink() {
        System.out.println("You drank the beer.");
    }
}
