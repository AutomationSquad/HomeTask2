package elements;
import interfaces.IClickable;
import interfaces.ISelectable;
import interfaces.IVisible;

public class Label extends Component implements IClickable, ISelectable, IVisible {

    private String name = "Label";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> child of " + super.mainValue);
    }

    @Override
    public void click() {
        System.out.println(getName() + " is clickable ");
    }

    @Override
    public void select() {
        System.out.println(getName() + " is selected");
    }

    @Override
    public void display() {
        System.out.println(getName() + " is visible");
    }
}
