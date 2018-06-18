package elements;

import interfaces.IClickable;
import interfaces.IVisible;

public class TextComponent  extends Component implements IClickable, IVisible {

    protected String mainValue = "TextComponent";

    @Override
    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + "-> child of " + super.mainValue);
    }

    @Override
    public void click() {
        System.out.println(getMainValue() + " is clickable");
    }

    @Override
    public void display() {
        System.out.println(getMainValue() + " is visible");
    }
}
