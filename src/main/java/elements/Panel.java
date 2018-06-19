package elements;

import interfaces.IClickable;

public class Panel extends Container {

    public IClickable[] clickables;

    public Panel(String name, IClickable[] clickables) {
        super(name);
        this.clickables = clickables;
    }

}
