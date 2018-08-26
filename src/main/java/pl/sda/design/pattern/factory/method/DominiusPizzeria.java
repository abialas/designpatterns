package pl.sda.design.pattern.factory.method;

/**
 * Created by adam.
 */
public class DominiusPizzeria extends Pizzeria {

    @Override
    public Pizza createPizza(String type) {
        if ("grecka".equals(type)) {
            return new GreckaPizza();
        } else if ("serowa".equals(type)) {
            return new SerowaPizza();
        }
        return null;
    }

    @Override
    public void printReceipt() {
        System.out.println("custom print");
    }
}
