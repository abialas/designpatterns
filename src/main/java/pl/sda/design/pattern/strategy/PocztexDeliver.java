package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public class PocztexDeliver implements DeliveryMethod {

    @Override
    public void deliver() {
        System.out.println("Deliver with Pocztex");
    }
}
