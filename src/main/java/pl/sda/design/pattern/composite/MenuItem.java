package pl.sda.design.pattern.composite;

/**
 * Created by adam.
 */
public abstract class MenuItem {

    public void add(MenuItem menuItem) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuItem menuItem) {
        throw new UnsupportedOperationException();
    }

    public void get(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getAction() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
