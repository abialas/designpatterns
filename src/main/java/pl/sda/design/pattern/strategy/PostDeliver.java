package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public class PostDeliver implements DeliveryMethod {

    @Override
    public void deliver() {
        System.out.println("Deliver with post");
    }
}
