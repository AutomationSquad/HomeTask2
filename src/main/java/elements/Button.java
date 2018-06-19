package elements;

import Interfaces.IClickable;
import Interfaces.IClosable;
import Interfaces.ISelectable;
import Interfaces.IVisible;

public class Button extends Component implements IClickable, ISelectable, IVisible {

    private String titleButton;
    private String color;
    private Boolean enable;


    public Button (String s, String c, Boolean b) {
        this.setTitle(s);
        this.setColor(c);
        this.setEnable(b);
    }



    public String getTitle() {
        return titleButton;
    }

    public void setTitle(String title) {
        this.titleButton = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override

    public void click() {

        System.out.println("The button is clicked");
    }

    @Override

    public void visible() {

        System.out.println("The button is visible");
    }

    @Override

    public void select() {

        System.out.println("The button is selected");
    }

}