package elements;

import interfaces.IClickable;

public class CheckboxGroup implements IClickable {
    String title;

    public CheckboxGroup(String title) {
        this.title = title;
    }

    public void click() {
        System.out.println(title + " is clicked.");
    }
}
