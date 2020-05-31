package StructuralDesignPatterns.Bridge;

/**
 * Implementing the bridge design pattern provides us the flexibility
 * to avoid the "Cartesian product" complexity explosion.
 * In the following example, without using the Bridge pattern, we would have to
 * implement both Vector and Raster drawing classes for each of the different geometrical shapes provided,
 * e.g. for the following three shapes- Circle, Rectangle and Triangle we would need to have six different implementations
 * to provide the drawing functionality.
 * Implementing the Bridge pattern, that number greatly reduces, and in our case it drops to the two Renderer implementations,
 * and a class for each of the shapes. For more shapes added, the effect would of course be greater.
 * The real rendering functionality wasn't implemented because the focus is on the Bridge pattern implementation.
 */
public class BridgeDemo {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(new VectorRenderer());
        Shape circle = new Circle(new RasterRenderer());

        rectangle.render();
        circle.render();
    }
}
