package StructuralDesignPatterns.Bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void render() {
        System.out.println("Raster rendering...");
    }
}
