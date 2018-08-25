package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class ExcelSheet {

    private Font font;
    private Style style;

    public ExcelSheet(Font font, Style style) {
        this.font = font;
        this.style = style;
    }

    public void create() {
        System.out.println("Creating Excel sheet with style: " + style + " and font: " + font);
    }

}
