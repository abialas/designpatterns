package pl.sda.design.pattern.template.method;

import java.util.Collections;
import java.util.List;

/**
 * Created by adam.
 */
public class FromMaxToMinCalculator extends Calculator {

    @Override
    protected void sortNumbers(List<Double> numbers) {
        Collections.sort(numbers);
    }

}
