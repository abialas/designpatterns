package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class Style {

    private String styleName;

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public void initializeStyle() {
        System.out.println("Init style " + styleName);
    }

    @Override
    public String toString() {
        return "Style{" + "styleName='" + styleName + '\'' + '}';
    }
}
