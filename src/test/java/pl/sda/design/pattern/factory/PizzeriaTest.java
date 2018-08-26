package pl.sda.design.pattern.factory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class PizzeriaTest {

    @Test
    public void testOrderPizza() {
        Pizzeria pizzeria = new Pizzeria(new PizzeriaFactory());
        double price = pizzeria.orderPizza("serowa");

        assertThat(price, equalTo(30.0));
    }

}
