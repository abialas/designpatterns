package pl.sda.design.pattern.facade;

/**
 * Created by adam.
 */
public class Size {

    private int width;
    private int height;

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Size{" + "width=" + width + ", height=" + height + '}';
    }
}
