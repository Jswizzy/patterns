package name.jnsmith.patterns.structure.bridge;

public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();
        Shape square = new Square(blue);
        Shape circle = new Circle(red);
        Shape greenCircle = new Circle(green);

        square.applyColor();
        circle.applyColor();
        greenCircle.applyColor();
    }
}
