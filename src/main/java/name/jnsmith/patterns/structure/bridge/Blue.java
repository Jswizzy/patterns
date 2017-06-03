package name.jnsmith.patterns.structure.bridge;

public class Blue implements Color {

    @Override
    public void applyColor() {
        System.out.println("Apply blue color");
    }
}
