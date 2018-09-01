package pl.sda.design.pattern.mediator;

/**
 * Created by adam.
 */
public class Receiver {

    private Mediator mediator;

    public Receiver(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println("Send message: " + message);
        mediator.sendMessage(message);
    }

    public void receiveScreen() {
        System.out.println("Receiving screen sharing");
    }

}
