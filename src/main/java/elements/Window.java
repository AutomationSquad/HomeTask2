package elements;

import Interfaces.IClickable;
import Interfaces.IClosable;
import Interfaces.IDragable;
import Interfaces.IScrollable;

public class Window extends Container implements IClickable, IClosable, IScrollable, IDragable {

    private String button;

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    @Override
    public void click() {
        System.out.println("Click on the button" + button);
    }

    @Override

    public void close() {
        System.out.println("Close button");
    }

    @Override

    public void scroll() {

        System.out.println("Scroll window");

    }

    @Override

    public void drag() {

        System.out.println("Drag the window");
    }





}