package BehavioralDesignPatterns.NullObject;

import java.lang.reflect.Proxy;

/**
 * A DynamicNullObject demo which creates a null object at runtime.
 * A dynamic proxy is used in the example.
 * It comes handy in situations when we have many classes to implement.
 * At runtime we construct an object which conforms to the provided interface
 * (in this case the FunctionalityExpander interface), and tell this object to
 * basically do nothing, more precisely, to return the default return type if a
 * return type is required.
 * Of course, this approach has its drawbacks. If somewhere in the code, the state of the
 * FunctionalityExpander implementer is asked, there will be a malfunction.
 * Other than that, the dynamic proxies are computationally expensive, so maybe we
 * should consider going the route specified in the NullObjectDemo.java.
 * @author Vitomir M
 */
public class DynamicNullObjectDemo {

    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> iface)
    {
        return (T) Proxy.newProxyInstance(
                iface.getClassLoader(),
                new Class<?>[]{iface},
                (proxy, method, args) ->
                {
                    if (method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                });
    }

    public static void main(String[] args) {

        FunctionalityExpander functionalityExpander = noOp(FunctionalityExpander.class);
        TemperatureSensor temperatureSensor = new TemperatureSensor(functionalityExpander);
        temperatureSensor.updateTemperature(26.00);
    }
}
