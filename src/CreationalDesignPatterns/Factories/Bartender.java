package CreationalDesignPatterns.Factories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bartender {

    private AvailableDrink selectedDrink;
    private List<AvailableDrink> drinks = Arrays.asList(AvailableDrink.values());
    private Map<AvailableDrink, DrinkableFactory> factories =
            new HashMap<>();

    public Bartender() {
        for (AvailableDrink drink : AvailableDrink.values()) {
            try {
                String s = drink.toString();
                String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                Class<?> factory = Class.forName("CreationalDesignPatterns.Factories." + factoryName + "Factory");
                factories.put(drink, (DrinkableFactory) factory.getDeclaredConstructor().newInstance());
            } catch (InstantiationException | InvocationTargetException |
                    NoSuchMethodException | IllegalAccessException |
                    ClassNotFoundException ex) {
                ex.getMessage();
            }
        }
    }

    public void greet(){
        System.out.println("Welcome to our pub!");
    }

    public Drinkable getOrder() {
        System.out.println("Available drinks: ");
        int index = 0;
        for (Map.Entry<AvailableDrink, DrinkableFactory> drink : factories.entrySet()) {
            System.out.println(++index + ": " + drink.getKey());
        }
        System.out.println("Please input the number of the drink above you would like to order: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i;
            try {
                if ((s = reader.readLine()) != null
                        && (i = Integer.parseInt(s)) > 0
                        && i <= factories.size()) {
                    selectedDrink = drinks.get(i - 1);
                    return factories.get(selectedDrink).order();

                } else {
                    System.out.println("Incorrect input, try again.");
                }
            } catch (IOException ex) {
                //skip
            }
        }

    }

}
