package CreationalDesignPatterns.Prototype.UsingCopyConstructors;

import CreationalDesignPatterns.Prototype.UsingCloneable.Transmission;

/**
 *Implementing a prototype pattern using copy constructors which provide a deep copy of the object.
 * Cars Volkswagen Golf 3 and Golf 4 have many similarities modeled in the car class so we can show
 * the prototype pattern in action.
 */
public class PrototypeDemoCopyConstructors {
    public static void main(String[] args) {

        //setting up the Gps and Car instances to copy
        GPS gps = new GPS("TomTom", "Go Basic 6''", new String[]{"home", "work", "grandma's"});
        Car golf3 = new Car("Volkswagen",
                "Golf 3", 5, 5,
                0, 178,
                Transmission.MANUAL, gps);

        //copying the car instance
        Car golf4 = new Car(golf3);

        //changing the newly created instance
        golf4.setModel("Golf 4");
        golf4.setMaxSpeed(216);
        golf4.setTransmission(Transmission.AUTOMATIC);

        //changing the gps instance on the cloned car
        golf4.getGps().setSavedLocations(new String[]{"parent's place", "company", "favorite pub" });

        //printout
        System.out.println(golf3);
        System.out.println("--------------------------");
        System.out.println(golf4);
    }
}
