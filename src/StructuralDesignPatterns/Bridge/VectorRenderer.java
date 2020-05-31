package StructuralDesignPatterns.Bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void render() {
        System.out.println("Vector rendering...");
    }
}
