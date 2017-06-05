package name.jnsmith.patterns.creational.prototype;

public class Demo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creation Patterns");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anthorMovie = (Movie) registry.createItem("Movie");
        anthorMovie.setTitle("Gang of four");

        System.out.println(anthorMovie);
        System.out.println(anthorMovie.getRuntime());
        System.out.println(anthorMovie.getTitle());
        System.out.println(anthorMovie.getUrl());
    }
}
