package elements;

import interfaces.IClickable;
import interfaces.IFocusable;

public class TextComponent extends Component implements IClickable{

    protected boolean isInFocus = false;
    public String text;

    public TextComponent(String name) {
        super(name);
    }

    public void click() {
        this.isInFocus = true;
    }

    public boolean isInFocus() {
        return this.isInFocus;
    }

    public void sendText(String text) {
        this.text += text;
        System.out.print("Added new text, the new text now is: " + this.text);
    }

    public void clearText() {
        this.text = "";
        System.out.println("Cleared the text!");
    }

}
