package StructuralDesignPatterns.Bridge;

public class Triangle extends Shape {

    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void render() {
        System.out.println("Type of rendering provided for the triangle: " );
        renderer.render();
    }


}
