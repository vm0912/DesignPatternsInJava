package CreationalDesignPatterns.Prototype.UsingSerialization;

import CreationalDesignPatterns.Prototype.UsingCloneable.Transmission;
import org.apache.commons.lang3.SerializationUtils;

/**
 *Implementing a prototype pattern using serialization which provide a deep copy of the object.
 * Apache.commons was imported for the serialization functionality, and all the classes have to implement
 * Serializable interface.
 * Cars Volkswagen Golf 3 and Golf 4 have many similarities modeled in the car class so we can show
 * the prototype pattern in action.
 */
public class PrototypeDemoSerialization {
    public static void main(String[] args) {

        //setting up the Gps and Car instances to copy
        GPS gps = new GPS("TomTom", "Go Basic 6''", new String[]{"home", "work", "grandma's"});
        Car golf3 = new Car("Volkswagen",
                "Golf 3", 5, 5,
                0, 178,
                Transmission.MANUAL, gps);

        //copying the car instance
        Car golf4 = SerializationUtils.roundtrip(golf3);
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
