package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class ExcelSheet {

    private Size size;
    private Font font;
    private Style style;

    public ExcelSheet(Size size, Font font, Style style) {
        this.size = size;
        this.font = font;
        this.style = style;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void create() {
        if (size == null || font == null || style == null) {
            throw new IllegalArgumentException("Font and style cannot be null");
        }
        System.out.println("Creating Excel sheet with size: " + size + " style: " + style + " and font: " + font);
    }

}
