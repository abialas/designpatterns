package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public class Cash implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(String.format("Pay amount with cash: %d", amount));
    }
}
