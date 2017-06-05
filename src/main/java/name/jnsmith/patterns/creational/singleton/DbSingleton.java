package name.jnsmith.patterns.creational.singleton;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {
        // can be something like a db instance setup
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            // calling if null twice to prevent unnecessary synchronization
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
