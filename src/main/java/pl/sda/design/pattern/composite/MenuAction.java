package pl.sda.design.pattern.composite;

/**
 * Created by adam.
 */
public class MenuAction extends MenuItem {

    private final String action;
    private final String name;

    public MenuAction(String action, String name) {
        this.action = action;
        this.name = name;
    }

    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("MenuAction{action='" + action + '\'' + ", name='" + name + '\'' + '}');
    }

}
