package pl.sda.design.pattern.proxy;

/**
 * Created by adam.
 */
public class BankAccountProxy {
    BankAccount bankAccount;

    public BankAccountProxy() {
        bankAccount = new BankAccount();
    }

    public void addAmount(double amount) {
        bankAccount.addAmount(amount);
    }

    public void withdrawAmount(double amount) {
        if (getBalance() >= amount) {
            bankAccount.withdrawAmount(amount);
        }
    }

    public double getBalance() {
        return bankAccount.getBalance();
    }
}
