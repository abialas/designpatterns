package pl.sda.design.pattern.strategy;

/**
 * Created by adam.
 */
public class Order {

    private double amount;
    private PaymentMethod paymentMethod;
    private DeliveryMethod deliveryMethod;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void pay() {
        paymentMethod.pay(amount);
    }

    public void deliver() {
        deliveryMethod.deliver();
    }
}
