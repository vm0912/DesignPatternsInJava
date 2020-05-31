package StructuralDesignPatterns.Bridge;

public class Rectangle extends Shape {

    public Rectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        System.out.println("Type of rendering provided for the rectangle: " );
        renderer.render();
    }
}
