package elements;

import interfaces.IClickable;
import interfaces.IMovable;
import interfaces.IVisible;

public class Label extends Component implements IClickable, IMovable, IVisible {
    public Label(String title) {
        this.title = title;
    }

    public void click() {
        System.out.println(this.title + " is clicked");
    }

    public void move(int distance) {
        System.out.println(this.title + " was moved on " + distance);
    }

    public void visible() {
        System.out.println(this.title + " is visible");
    }
}
