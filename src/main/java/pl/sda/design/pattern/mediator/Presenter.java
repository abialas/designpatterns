package pl.sda.design.pattern.mediator;

/**
 * Created by adam.
 */
public class Presenter {

    private Mediator mediator;

    public Presenter(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showScreen() {
        System.out.println("Screen sharing");
        mediator.showScreen();
    }

    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

}
