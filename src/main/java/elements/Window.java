package elements;

public class Window extends Container {

    private String button;

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    void clickButton() {
        System.out.println("Click on the button" + button);
    }



}
