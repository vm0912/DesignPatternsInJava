package StructuralDesignPatterns.Facade;

/**
 *A class to represent the Oven for the brownie baking process. Oversimplification is done on purpose.
 */
public class Oven {


    public void preheat() {
        System.out.println("The oven is preheated to 180°C...");
    }

    public void bake(Batter batter) {
        System.out.println("The batter is baking...");
        System.out.println("The baking process is complete!");
    }
}
