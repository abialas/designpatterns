package pl.sda.design.pattern.singleton;

/**
 * Created by adam.
 */
public class RegistrySingletonLazy {

    private volatile static RegistrySingletonLazy instance;

    private RegistrySingletonLazy() {

    }

    public static RegistrySingletonLazy getInstance() {
        if (instance == null) {
            synchronized (RegistrySingletonLazy.class) {
                if (instance == null) {
                    instance = new RegistrySingletonLazy();
                }
            }
        }
        return instance;
    }

}
