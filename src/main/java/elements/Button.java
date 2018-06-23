package elements;

import interfaces.IClickable;
import interfaces.IMovable;

public class Button extends Component implements IClickable, IMovable {
    String color;

    public Button() {
        this.title = "Submit";
        this.width = 3;
        this.height = 3;
        this.color = "Blue";
    }

    public Button(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void click() {
        System.out.println(title + " is clicked");
    }

    public void move(int distance) {
        System.out.println(title + " is moved on " + distance);
    }

    public void hide() {
        System.out.println(title + " is hidden");
    }
}