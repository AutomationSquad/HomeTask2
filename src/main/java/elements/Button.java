package elements;

import interfaces.IClickable;
import interfaces.IVisible;

public class Button extends Component implements IClickable, IVisible {
    public String form;
    public boolean clickable;

    public void click() {
        System.out.print("Clickable");
    }

    public void isDisplayed() {
        System.out.print("isDisplayed");
    }


    public Button(String name, String form, boolean clickable) {
        super(name);
        this.form = form;
        this.clickable = clickable;
    }

    public void printName() {
        System.out.println("this is: "+ name + "with form: "+ form + "clickable:" + clickable);

    }
}
