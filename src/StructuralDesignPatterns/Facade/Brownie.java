package StructuralDesignPatterns.Facade;

/**
 *A class to represent the Brownie itself. Oversimplification is done on purpose.
 */
public class Brownie {

    private Batter batter;
    private Frosting frosting;

    private Brownie(Batter batter, Frosting frosting){
        this.batter = batter;
        this.frosting= frosting;
    }
    public static Brownie combineIngredients(Batter batter, Frosting frosting) {
        System.out.println("The batter and the frosting are combined.");
        return new Brownie(batter,frosting);

    }
}
