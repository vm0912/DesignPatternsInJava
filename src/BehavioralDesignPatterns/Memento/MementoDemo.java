package BehavioralDesignPatterns.Memento;

/**
 *Memento design pattern acts as a token/handle representing the system state.
 * It lets us roll back to the state when the token was generated.
 * It may or may not directly expose state information.
 * @author Vitomir M
 */
public class MementoDemo {
    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureSensor();
        Memento memento1 = sensor.updateTemperature(27.00);
        Memento memento2 = sensor.updateTemperature(31.00);
        Memento memento3 = sensor.updateTemperature(26.00);
        Memento memento4 = sensor.updateTemperature(28.00);

        //retrieving current state
        System.out.println(sensor);

        //restoring the state from memento 2
        sensor.restoreState(memento2);
        System.out.println(sensor);

        //restoring the state from memento 4
        sensor.restoreState(memento4);
        System.out.println(sensor);




    }
}
