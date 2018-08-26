package pl.sda.design.pattern;

import org.junit.Test;
import pl.sda.design.pattern.singleton.RegistrySingletonLazy;

/**
 * Created by adam.
 */
public class RegistrySingletonLazyTest {

    @Test
    public void checkSameInstanceTwoThreads() throws InterruptedException {
        Thread thread1 = new Thread(() -> System.out.println(RegistrySingletonLazy.getInstance()));
        Thread thread2 = new Thread(() -> System.out.println(RegistrySingletonLazy.getInstance()));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

}
