package name.jnsmith.patterns.creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton dbSingleton = DbSingleton.getInstance();

        System.out.println(dbSingleton);

        DbSingleton anotherDbSingleton = DbSingleton.getInstance();

        System.out.println(anotherDbSingleton);
    }
}
