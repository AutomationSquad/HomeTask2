package elements;

import interfaces.IVisible;


public class Checkbox extends Component implements IVisible {
    public Checkbox(String title) {
        this.title = title;
    }

    public void visible() {
        System.out.println(title + " is visible");
    }
}
