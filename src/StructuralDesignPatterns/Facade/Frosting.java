package StructuralDesignPatterns.Facade;

import java.util.List;
/**
 *A class to represent the Frosting for the brownie. Oversimplification is done on purpose.
 */
public class Frosting {
    private List<String> frostingIngredients;
    private Frosting(List<String>frostingIngredients){
        this.frostingIngredients= frostingIngredients;
    }

    public static Frosting makeFrosting(List<String> frostingIngredients){
        System.out.println("The frosting is ready!");
        return new Frosting(frostingIngredients);

    }
}
