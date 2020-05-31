package CreationalDesignPatterns.Singleton;

/**
 *Singleton pattern provides only one instance of the class that implemented the named pattern, to be more precise,
 * only one instance exist in JVM.
 * The code below models a thread-safe lazy initialization using holder class Bill Pugh Singleton implementation.
 * The implementation  takes advantage of the language’s thread safety guarantees
 * for static initialization without requiring additional synchronization.
 */
public class Singleton {

    private int value = 0;
    private Singleton() {
    }

    public int getValue()
    {
        return value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

    public static Singleton getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static class InstanceHolder {
        static final Singleton INSTANCE = new Singleton();
    }

}