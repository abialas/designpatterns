package pl.sda.design.pattern.template.method;

import java.util.Collection;
import java.util.List;

/**
 * Created by adam.
 */
public abstract class Calculator {

    public final double sumFirstTenNumbers(List<Double> numbers) {
        sortNumbers(numbers);
        return numbers.stream()
          .limit(10)
          .mapToDouble(Number::doubleValue)
          .sum();
    }

    protected abstract void sortNumbers(List<Double> numbers);

}
