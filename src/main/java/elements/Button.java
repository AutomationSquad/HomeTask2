package elements;

import interfaces.IClickable;
import interfaces.IVisible;

public class Button extends Component implements IClickable, IVisible {
    private boolean buttonState;
    private String buttonColor;

    Button(String newComponentName, int newSize, boolean buttonState, String buttonColor) {
        super(newComponentName, newSize);
        this.buttonState=buttonState;
        this.buttonColor=buttonColor;
    }

    @Override
    public void hoverOnComponent() {
        System.out.println("Button is hovered");
    }

    public void clickOnButton(){
        System.out.println("Button is clicked");
    }
    public void colorOfButton(){
        System.out.println("The color of the button is " + buttonColor);
    }

    public void click() {
        System.out.println("Button is clickable");
    }

    public void visible() {
        System.out.println("Button is visible");
    }

    public void invisible() {
        System.out.println("Button is invisible");
    }
}
