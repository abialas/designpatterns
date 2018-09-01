package pl.sda.design.pattern.mediator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by adam.
 */
public class Mediator {

    private Presenter presenter;
    private Collection<Receiver> receivers;

    public Mediator(Presenter presenter) {
        this.presenter = presenter;
        this.receivers = new ArrayList<>();
    }

    public void addReceiver(Receiver receiver) {
        receivers.add(receiver);
    }

    public void showScreen() {
        receivers.stream()
          .forEach(Receiver::receiveScreen);
    }

    public void sendMessage(String message) {
        presenter.receiveMessage(message);
    }

}
