package pl.sda.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adam.
 */
public class Menu extends MenuItem {

    private String name;
    private List<MenuItem> menuItems;

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    @Override
    public void add(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    @Override
    public void remove(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    @Override
    public void get(int i) {
        menuItems.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Menu{name='" + name + "\'}");
        menuItems.forEach(MenuItem::print);
    }
}
