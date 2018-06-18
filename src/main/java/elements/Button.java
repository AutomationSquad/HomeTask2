package elements;

import interfaces.IClickable;
import interfaces.IVisible;

public class Button  extends Component implements IClickable, IVisible{
    protected String name;
    protected String position;
    protected boolean status;
    protected String color;

    public Button(String name, String position, boolean status, String color) {
        this.name = name;
        this.position = position;
        this.status = status;
        this.color = color;
    }

    @Override
    public void highlightComponent(){
        System.out.println(name + " is highlighted.");
        System.out.println(name + "`s" + " status is " + status);
        System.out.println(name + "`s" + " color is " + color);
    }

    public void clickOnButton(){
        System.out.println(name + " was  clicked");
    }

    @Override
    public void click() {
        this.clickOnButton();
    }

    @Override
    public boolean isDisplayed() {
        return true;
    }
}
