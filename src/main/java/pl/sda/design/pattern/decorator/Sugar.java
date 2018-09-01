package pl.sda.design.pattern.decorator;

/**
 * Created by adam.
 */
public class Sugar implements Drink {

    private Drink drink;

    public Sugar(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 0.1;
    }

    public void prepare() {
        System.out.println("Prepare");
    }
}
