package elements;

import interfaces.IClosable;
import interfaces.IScrollable;
import interfaces.ISelectable;

public class Window extends Container implements IClosable, IScrollable, ISelectable {
    Boolean borderExists = true;
    int secondsForAction;
    boolean direction;

    public Window() {
        super("Window", true);
        this.secondsForAction = this.secondsForAction;
    }

    public void hide(int secondsForAction) {
        System.out.println(this.title + "is hidden in " + secondsForAction + " seconds.");
    }

    public void scroll(boolean direction) {
        direction = true;
        if (true) {
            System.out.println(this.title + " is scrolled up");
        } else {
            System.out.println(this.title + " is scrolled down");
        }
    }

    public String select() {
        return super.title;
    }

    @Override
    public void close() {
        System.out.println(this.title + "is closed");
    }
}
