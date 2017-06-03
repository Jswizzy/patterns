package name.jnsmith.patterns.structure.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public void applyColor() {
        color.applyColor();
    }
}
