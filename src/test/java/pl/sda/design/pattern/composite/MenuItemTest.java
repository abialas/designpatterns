package pl.sda.design.pattern.composite;

import org.junit.Test;

/**
 * Created by adam.
 */
public class MenuItemTest {

    @Test
    public void testPrintMenu() {
        MenuItem documentMenu = new Menu("Document");
        documentMenu.add(new MenuAction("Save", "Save"));
        documentMenu.add(new MenuAction("Edit", "Edit"));

        MenuItem additionalOperationMenu = new Menu("Additional operation");
        additionalOperationMenu.add(new MenuAction("Print toPDF", "Print to PDF"));
        additionalOperationMenu.add(new MenuAction("Export toCSV", "Export to CSV"));

        documentMenu.add(additionalOperationMenu);

        documentMenu.print();
    }

}
