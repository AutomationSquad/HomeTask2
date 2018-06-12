package elements;

public class Frame  extends Window {
    public Frame(String name, Button closeButton, Button collapseButton, Button expandButton) {
        super(name, closeButton, collapseButton, expandButton);
    }

    @Override
    public void expand(Button expandButton){
        expandButton.clickOnButton();
        System.out.println(name + " is expanded to full screen.");
    }

    @Override
    public void collapse(Button collapseButton){
        collapseButton.clickOnButton();
        System.out.println(name + " is collapsed to full screen.");
    }
}
