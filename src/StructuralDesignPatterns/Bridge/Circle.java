package StructuralDesignPatterns.Bridge;

public class Circle extends Shape {

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        System.out.println("Type of rendering provided for the circle: " );
        renderer.render();
    }


}
