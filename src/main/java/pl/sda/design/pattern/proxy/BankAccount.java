package pl.sda.design.pattern.proxy;

/**
 * Created by adam.
 */
class BankAccount {

    private double balance;

    public void addAmount(double amount) {
        balance += amount;
    }

    public void withdrawAmount(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
