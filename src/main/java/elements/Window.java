package elements;

import interfaces.IClose;
import interfaces.IDraggable;
import interfaces.IVisible;

public class Window extends Container implements IClose, IVisible, IDraggable {

    protected String mainValue = "Window";

    @Override
    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + "-> 2nd child of " + super.mainValue);
    }

    @Override
    public void close() {
        System.out.println(getMainValue() + " can be closed");
    }

    @Override
    public void display() {
        System.out.println(getMainValue() + " is displayed");
    }

    @Override
    public void drag() {
        System.out.println(getMainValue() + " can be dragged");
    }
}
