package name.jnsmith.patterns.structure.decorator;

public class demo {

    public static void main(String[] args) {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator( new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
