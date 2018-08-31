package pl.sda.design.pattern.adapter;

/**
 * Created by adam.
 */
public class ReceiptPrinter implements Printer {

    @Override
    public void printReceipt(Object receipt) {
        System.out.println("Print receipt: " + receipt);
    }
}
