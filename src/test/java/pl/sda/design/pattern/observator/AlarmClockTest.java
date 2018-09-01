package pl.sda.design.pattern.observator;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by adam.
 */
public class AlarmClockTest {

    private AlarmClock alarmClock;

    @Before
    public void setup() {
        this.alarmClock = new AlarmClock();
    }

    @Test
    public void testNotifyHumanAt5() {
        alarmClock.addObserver(new HumanObservator());
        alarmClock.addObserver(new CoffeeExpress());
        alarmClock.alarm(5);
    }

    @Test
    public void testNotifyCoffeeAt6() {
        alarmClock.addObserver(new HumanObservator());
        alarmClock.addObserver(new CoffeeExpress());
        alarmClock.alarm(6);
    }

}
