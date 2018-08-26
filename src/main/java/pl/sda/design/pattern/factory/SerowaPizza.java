package pl.sda.design.pattern.factory;

/**
 * Created by adam.
 */
public class SerowaPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Przygotowanie serowej pizzy");
    }

    @Override
    public double price() {
        return 30.0;
    }
}
