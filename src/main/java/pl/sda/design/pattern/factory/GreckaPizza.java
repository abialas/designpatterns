package pl.sda.design.pattern.factory;

/**
 * Created by adam.
 */
public class GreckaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Grecka pizza");
    }

    @Override
    public double price() {
        return 25.0;
    }
}
