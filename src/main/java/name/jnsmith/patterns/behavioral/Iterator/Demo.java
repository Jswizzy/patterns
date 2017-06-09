package name.jnsmith.patterns.behavioral.Iterator;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();


        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        for (String b : repo) {
            System.out.println(b);
        }
    }
}
