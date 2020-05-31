package StructuralDesignPatterns.Proxy;

/**
 * Proxy design pattern is a class that functions as an interface to a particular resource.
 * That resource may be remote, expensive to construct, or may require logging or some other added
 * functionality.
 * The type of proxy implemented is known as a Protection Proxy, which adds a layer of the
 * protection to the object. In other words, we could check if the client request is valid, or
 * does he have the authority to request an execution of a specific task.
 * The class ProxyDemo represents a simple demonstration  of the named pattern implementation.
 *  * In the following example it is checked whether the person likes running or not by the method
 *  overridden in proxy.
 * @author Vitomir M
 */
public class ProxyDemo {
    public static void main(String[] args) {

        Person ivan = new Person("Ivan", false);
        //not using proxy, so the owner, who doesn't like running has to run
        Dog laika = new Dog("Laika", "Mongrel",ivan );
        laika.runWithOwner();

        //using proxy
        Dog thor = new DogProxy("Thor", "Mongrel",ivan);
        thor.runWithOwner();

    }
}
