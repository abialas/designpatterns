package pl.sda.design.pattern.decorator;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class CoffeeTest {

    @Test
    public void coffeeWithMilk() throws FileNotFoundException {
        Coffee coffee = new Coffee();
        Milk milk = new Milk(coffee);
        Sugar sugar = new Sugar(milk);

        sugar.prepare();

        assertThat(milk.getPrice(), equalTo(2.5));
        assertThat(sugar.getPrice(), equalTo(2.6));

        new BufferedInputStream(new FileInputStream("ssss"));
    }

}
