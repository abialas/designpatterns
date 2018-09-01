package pl.sda.design.pattern.observator;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by adam.
 */
public class HumanObservator implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof Integer)) {
            return;
        }
        Integer hour = (Integer) arg;
        if (hour == 5) {
            System.out.println("Wake up");
        }
    }

}
