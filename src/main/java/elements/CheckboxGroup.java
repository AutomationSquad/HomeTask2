package elements;

import interfaces.ISelectable;

public class CheckboxGroup extends Options implements ISelectable {
    private String name = "CheckboxGroup";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "- another separate root class");
    }

    @Override
    public void select() {
        System.out.println(getName() + " is selected");
    }

    //----------------------------------------

    private int x;
    private int y;

    public CheckboxGroup(int x, int y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    @Override
    public int getOptionSettings() {
        x += ++x + y--/(x++ - ++y) + --x;
        return (x);
    }
}
