package pl.sda.design.pattern.adapter;

/**
 * Created by adam.
 */
public class BillPrinterAdapter implements Printer {

    private BillPrinter billPrinter;

    public BillPrinterAdapter(BillPrinter billPrinter) {
        this.billPrinter = billPrinter;
    }

    @Override
    public void printReceipt(Object receipt) {
        billPrinter.printCustomerBill(receipt);
    }
}
