package elements;

import interfaces.ISelectable;
import interfaces.IVisible;

public class TextComponent extends Component implements ISelectable, IVisible {

    protected int size;
    protected String name;

    @Override
    public void highlightComponent() {
        System.out.println("This is  " + name + ", it's size is: " + size);
    }

    public void displayInputText(){
        System.out.println("Display input text.");
    }

    @Override
    public void select() {
        System.out.println(name + " is selected.");
    }

    @Override
    public boolean isDisplayed() {
        return true;
    }
}
