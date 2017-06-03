package name.jnsmith.patterns.structure.bridge;

public class Green implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying green");
    }
}
