package StructuralDesignPatterns.Decorator;

/**
 * The decorator pattern facilitates the addition of behaviors to individual objects without inheriting them.
 * Frequent use of the separate decorator can be found in classes that are final but still need to
 * get an extended functionality to satisfy the client.
 * Simply put, in the created decorator class we aggregate the object(s) which we like to decorate
 * and implement the methods needed for functionality extension.
 * @author Vitomir M
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        String test = "each and every word in this string will have its first letter capitalized.";
        StringDecorator decoratedString = new StringDecorator(test);
        System.out.println("Before decoration: ");
        System.out.println(decoratedString);
        decoratedString.capitalizeEveryFirstLetter();
        System.out.println("After decoration: ");
        System.out.println(decoratedString);

    }
}
