package pl.sda.design.pattern.factory;

/**
 * Created by adam.
 */
public class Pizzeria {

    private PizzeriaFactory pizzeriaFactory;

    public Pizzeria(PizzeriaFactory pizzeriaFactory) {
        this.pizzeriaFactory = pizzeriaFactory;
    }

    public double orderPizza(String type) {
        Pizza pizza = pizzeriaFactory.createPizza(type);
        if (pizza == null) {
            return 0.0;
        }
        pizza.prepare();
        return pizza.price();
    }

    public void printReceipt() {
        System.out.println("print");
    }
}
