package pl.sda.design.pattern.decorator;

/**
 * Created by adam.
 */
public class Milk implements Drink {

    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.5;
    }
}
