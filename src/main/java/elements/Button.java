package elements;
import interfaces.IClickable;
import interfaces.IClose;
import interfaces.IVisible;

public class Button extends Component implements IClickable, IVisible, IClose {

    private String name = "Button";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> child of " + super.mainValue);
    }

    @Override
    public void click() {
        System.out.println(getName() + " is clickable (IClickable interface)");
    }

    @Override
    public void display() {
        System.out.println(getName() + " is visible (IVisible interface)");
    }

    @Override
    public void close() {
        System.out.println(getName() + " can be closed");
    }
}
