package CreationalDesignPatterns.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();
        System.out.println("Value of the second singleton: " + secondSingleton.getValue());
        //setting the firstSingleton value
        firstSingleton.setValue(10);
        System.out.println("Value of the second singleton: " + secondSingleton.getValue());

        System.out.println("References point at the same object: " + (firstSingleton == secondSingleton));

        //Checking object equality in a multithreaded environment
        new Thread(() -> {
            System.out.println("Hashcode of a singleton instance in thread named '"+ Thread.currentThread().getName()
                    +"' : " +Singleton.getInstance().hashCode());
        }).start();

        new Thread(() -> {
            System.out.println( "Hashcode of a singleton instance in thread named '"+ Thread.currentThread().getName()
                    +"' : " +Singleton.getInstance().hashCode());
        }).start();
    }
}
