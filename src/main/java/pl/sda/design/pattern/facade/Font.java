package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class Font {

    private String fontName;

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void prepareFont() {
        System.out.println("Preparing font: " + fontName);
    }

    @Override
    public String toString() {
        return "Font{" + "fontName='" + fontName + '\'' + '}';
    }
}
