package name.jnsmith.patterns.structure.flyweight;

/**
 * efficient memory usage pattern
 *
 * large number of similar objects, immutable
 * pattern of pattern, uses factory pattern, creation and structure
 * UML: client, factory, flyweight, concreteFlyweight
 *
 * pitfalls:
 * complex
 * premature optimization
 *
 * usages: management, UI, small objects, inventory
 */

public class Everyday {

    public static void main(String[] args) {

        Integer firstInt = Integer.valueOf(5);

        Integer secondInt = Integer.valueOf(5);

        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));
    }
}
