package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class ExcelSheetFacade {

    private Font font;
    private Style style;

    public ExcelSheetFacade() {
        this.font = new Font();
        this.style = new Style();
    }

    public void initializeEmptySheet(String fontName, String styleName) {
        font.setFontName(fontName);
        font.prepareFont();

        style.setStyleName(styleName);
        style.initializeStyle();

        ExcelSheet excelSheet = new ExcelSheet(font, style);
        excelSheet.create();
    }

}
