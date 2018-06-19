package elements;

import Interfaces.IDragable;
import Interfaces.ISelectable;
import Interfaces.IVisible;

public class TextField extends TextComponent implements IVisible, IDragable, ISelectable{

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    @Override
    public void visible() {
        System.out.println("Text field contains " + length + "is visible");
    }

    @Override

    public void drag() {
        System.out.println("text component " + textComponent + "drag");
    }

    @Override

    public void select() {
        System.out.println("text component " + textComponent + "selected");
    }
}

