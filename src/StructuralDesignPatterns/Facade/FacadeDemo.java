package StructuralDesignPatterns.Facade;

import java.util.Arrays;
import java.util.List;

/**
 *A Facade pattern provides the user a simple, easy to understand interface over a
 * large and sophisticated body of code.
 * The given example is overly simplified, and it is suggested not to use the Facade pattern in
 * trivial scenarios, but focus here was on the implementation of the pattern, regardless the
 * complexity of the encapsulated lower-level API.
 */
public class FacadeDemo {
    public static void main(String[] args) {

        List<String> batterIngredients = Arrays.asList();
        List<String> frostingIngredients = Arrays.asList();
        BrownieMakerFacade brownieMaker = new BrownieMakerFacade(batterIngredients,frostingIngredients);
        brownieMaker.bakeBrownies();
    }
}
