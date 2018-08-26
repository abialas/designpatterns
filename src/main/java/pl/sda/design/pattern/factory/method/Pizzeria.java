package pl.sda.design.pattern.factory.method;

/**
 * Created by adam.
 */
public abstract class Pizzeria {

    public double orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza == null) {
            return 0.0;
        }
        pizza.prepare();
        return pizza.price();
    }

    public void printReceipt() {
        System.out.println("Receipt print");
    }

    public abstract Pizza createPizza(String type);

}
