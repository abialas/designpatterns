package pl.sda.design.pattern.factory;

/**
 * Created by adam.
 */
public class PizzeriaFactory {

    public Pizza createPizza(String type) {
        if ("grecka".equals(type)) {
            return new GreckaPizza();
        } else if ("serowa".equals(type)) {
            return new SerowaPizza();
        }
        return null;
    }

}
