package elements;

import interfaces.IClickable;
import interfaces.ISelectable;
import interfaces.ITypeValue;
import interfaces.IVisible;

public class FileDialog extends Dialog implements IClickable, ISelectable, ITypeValue, IVisible {

    private String name= "FileDialog";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> child of " + super.mainValue);
    }

    @Override
    public void click() { System.out.println(getName() + " is clickable"); }

    @Override
    public void select() {
        System.out.println(getName() + " is selected");
    }

    @Override
    public void display() {
        System.out.println(getName() + " is visible");
    }

}
