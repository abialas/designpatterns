package pl.sda.design.pattern.facade;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by adam.
 */
public class ExcelSheetTest {

    @Test
    public void testCreateSheet() {
        Size size = new Size(210, 297);

        Font font = new Font();
        font.setFontName("Arial");
        font.prepareFont();

        Style style = new Style();
        style.setStyleName("default");
        style.initializeStyle();

        ExcelSheet excelSheet = new ExcelSheet(size, font, style);
        excelSheet.create();

        assertThat(excelSheet.getFont(), notNullValue());
        assertThat(excelSheet.getStyle(), notNullValue());
        assertThat(excelSheet.getSize(), notNullValue());

    }

}
