package elements;

public class ExecuteElements {

    public static void main(String[] args) {

        Label buttonLabel = new Label("OK_button", true, true, 2);
        Checkbox checkboxItem = new Checkbox("show password", true, false);
        Button okButton = new Button("Apply",true);
        Applet someApplet = new Applet("Java applet", 1, false,true, 8);
        Window window = new Window("1st Window", 400, 600, true);

        buttonLabel.isDisplayed();
        buttonLabel.isActive();
        buttonLabel.highlightComponent();
        buttonLabel.getLength();
        System.out.println("\n");

        checkboxItem.isDisplayed();
        checkboxItem.isActive();
        checkboxItem.click();
        System.out.println("\n");

        okButton.isComponentPresent();
        okButton.highlightComponent();
        okButton.isActive();
        okButton.click();
        System.out.println("\n");

        someApplet.isDisplayed();
        someApplet.click();
        System.out.println("\n");

        window.isDisplayed();
        window.isActive();
        window.drag();
        window.close();
        System.out.println("\n");

    }
}
