package elements;

import interfaces.*;

public class Applet extends Panel  implements IClickable, IClosable, IScrollable, ISelectable {


    public Applet(Button button, TextField textField, Label label) {
        super(button, textField, label);
    }

    public void showAppletElements(Button button, TextField textField, Label label){
        button.highlightComponent();
        textField.highlightComponent();
        label.highlightComponent();
    }

    @Override
    public void click() {
        System.out.println(name + " was clicked");
    }

    @Override
    public void close() {
        Button closeButton;
        closeButton = new Button("Close button", "x,y", true,"Red");
        closeButton.click();
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll Up");
    }

    @Override
    public void scrollDown() {
        System.out.println("Scroll Down");
    }
}
