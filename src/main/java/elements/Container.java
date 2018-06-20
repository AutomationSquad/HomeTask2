package elements;

import interfaces.IMovable;

public class Container extends Component implements IMovable {
    Boolean transparent;

    public Container(String title, Boolean transparent) {
        this.title = title;
        this.transparent = transparent;
    }

    public void rotate() {
        System.out.println(this.title + " is rotated");
    }

    public void move(int distance) {
        System.out.println(this.title + " moved on " + distance);
    }
}