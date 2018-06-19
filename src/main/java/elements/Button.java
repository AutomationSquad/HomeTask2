package elements;

import interfaces.IClickable;

public class Button extends Component implements IClickable{

    public String text;

    public Button(String name, String text) {
        super(name);
        this.text = text;
    }

    @Override
    public void click() {
        System.out.println("Click on button " + this.name);
    }

}

