package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(String.format("Pay amount with credit card: %d", amount));
    }
}
