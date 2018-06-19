package elements;

import Interfaces.IClickable;
import Interfaces.IVisible;

public class Label extends Component implements IVisible, IClickable {

    private String textLabel;


    public String getTextLabel() {
        return textLabel;
    }

    public void setTextLabel(String textLabel) {
        this.textLabel = textLabel;
    }

    @Override

    public void visible() {
        System.out.println("Text label" + textLabel + "is visible");
    }


    @Override

    public void click() {
        System.out.println("Text label" + textLabel + "is closed");
    }


}