package pl.sda.design.pattern.observator;

import java.util.Observable;

/**
 * Created by adam.
 */
public class AlarmClock extends Observable {

    public void alarm(int hour) {
        setChanged();
        notifyObservers(hour);
    }

}
