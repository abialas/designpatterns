package pl.sda.design.pattern.singleton;

/**
 * Created by adam.
 */
public class RegistrySingleton {

    private static RegistrySingleton instance = new RegistrySingleton();

    private RegistrySingleton() {

    }

    public static RegistrySingleton getInstance() {
        return instance;
    }

}
