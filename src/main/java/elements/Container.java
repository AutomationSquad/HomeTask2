package elements;

import interfaces.IClickable;
import interfaces.IClosable;
import interfaces.IFocusable;

public class Container extends Component implements IClosable, IFocusable {

    protected boolean isInFocus = false;
    protected int posX, posY;  // default pos

    private Button closeButton = new Button("closeButton", "Close");

    public Container(String name) {
        super(name);
        this.posX = 0;
        this.posY = 0;
    }

    public Container(String name, int x, int y) {
        this(name);
        this.posX = x;
        this.posY = y;
    }


    public void close() {
        closeButton.click();
        System.out.println(this.name + " is closed!");
    }

    public void focus() {
        this.isInFocus = true;
        System.out.println(this.name + " is now in focus!");
    }

    public boolean isInFocus() {
        return this.isInFocus;
    }


}
