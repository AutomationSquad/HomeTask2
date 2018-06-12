package elements;

public class Window extends Container {

    private Button closeButton;
    private Button collapseButton;
    private Button expandButton;

    public Window(String name, Button closeButton, Button collapseButton, Button expandButton){
        this.name = name;
        this.closeButton = closeButton;
        this.collapseButton = collapseButton;
        this.expandButton = expandButton;
    }

    @Override
    public void storeElements(int elementsInside){
        System.out.println(name + " contains " + elementsInside + " elements inside");
        closeButton.clickOnButton();
        collapseButton.clickOnButton();
        expandButton.clickOnButton();
    }

    public void collapse(Button collapseButton){
        collapseButton.clickOnButton();
        System.out.println(name + " is collapsed.");
    }

    public void expand(Button expandButton){
        expandButton.clickOnButton();
        System.out.println(name + " is expanded.");
    }
}
