package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public abstract class Order {

    private double amout;
    private PaymentMethod paymentMethod;

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        paymentMethod.pay(amout);
    }
}
