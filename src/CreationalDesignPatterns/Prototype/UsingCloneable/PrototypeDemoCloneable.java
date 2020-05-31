package CreationalDesignPatterns.Prototype.UsingCloneable;


/**
 *Implementing a prototype pattern using cloneable interface provides a deep copy of the object.
 * Cars Volkswagen Golf 3 and Golf 4 have many similarities modeled in the car class so we can show
 * the prototype pattern in action.
 */
public class PrototypeDemoCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {

        //setting up the Gps and Car instances to copy
        GPS gps = new GPS("TomTom", "Go Basic 6''", new String[]{"home", "work", "grandma's"});
        Car golf3 = new Car("Volkswagen",
                "Golf 3", 5, 5,
                0, 178,
                Transmission.MANUAL, gps);


        //cloning the car instance
        Car golf4 = (Car) golf3.clone();

        //changing the newly created instance
        golf4.setModel("Golf 4");
        golf4.setMaxSpeed(216);

        //changing the gps instance on the cloned car
        golf4.getGps().setSavedLocations(new String[]{"parent's place", "company", "favorite pub" });

        //printout
        System.out.println(golf3);
        System.out.println("--------------------------");
        System.out.println(golf4);

    }
}
