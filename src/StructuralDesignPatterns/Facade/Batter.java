package StructuralDesignPatterns.Facade;

import java.util.List;

/**
 *A class to represent the Batter for the brownie. Oversimplification is done on purpose.
 */
public class Batter {
    private List<String> ingredients;

    private Batter(List<String> batterIngredients){
        this.ingredients = batterIngredients;
    }

    public static Batter makeBatter(List<String > batterIngredients){
        System.out.println("The ingredients are mixed and the batter is ready!");
        return new Batter(batterIngredients);
    }


}
