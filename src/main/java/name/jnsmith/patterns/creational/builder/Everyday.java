package name.jnsmith.patterns.creational.builder;

public class Everyday {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append(42);

        System.out.println(builder.toString());
    }
}
