package StructuralDesignPatterns.Facade;

import java.util.List;

/**
 *The Facade implementation. The hard work is done in the method
 * which is provided to the client to simplify the process.
 */
public class BrownieMakerFacade {

    private Oven oven;
    private List<String> batterIngredients;
    private List<String> frostingIngredients;
    private Batter batter;
    private Frosting frosting;
    private Brownie brownie;

    public BrownieMakerFacade(List<String> batterIngredients, List<String> frostingIngredients) {
        this.batterIngredients = batterIngredients;
        this.frostingIngredients = frostingIngredients;
        this.oven = new Oven();
    }


    public void bakeBrownies(){
        oven.preheat();
        batter = Batter.makeBatter(batterIngredients);
        oven.bake(batter);
        frosting = Frosting.makeFrosting(frostingIngredients);
        brownie = Brownie.combineIngredients(batter, frosting);
        System.out.println("The brownies are now done, enjoy!");
    }
}
