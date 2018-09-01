package pl.sda.design.pattern.template.method;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adam.
 */
public class CalculatorTest {

    @Test
    public void testSumMax10Numbers() {
        Calculator calculator = new FromMaxToMinCalculator();

        double sum = calculator.sumFirstTenNumbers(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0));

        assertThat(sum, equalTo(55.0));
    }

}
