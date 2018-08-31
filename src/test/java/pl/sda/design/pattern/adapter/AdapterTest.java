package pl.sda.design.pattern.adapter;

import org.junit.Test;

/**
 * Created by adam.
 */
public class AdapterTest {

    @Test
    public void testBillPrinterWorksAsReceiptPrinter() {
        Printer printer = new BillPrinterAdapter(new BillPrinter());
        printer.printReceipt("bill");
    }

}
