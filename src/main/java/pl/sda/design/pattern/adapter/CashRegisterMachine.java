package pl.sda.design.pattern.adapter;

/**
 * Created by adam.
 */
public class CashRegisterMachine {

    private Printer receiptPrinter;

    public CashRegisterMachine(Printer receiptPrinter) {
        this.receiptPrinter = receiptPrinter;
    }

    public void finishTransaction() {
        System.out.println("Prepare receipt");
        Object receipt = new Object();
        receiptPrinter.printReceipt(receipt);
    }

}
