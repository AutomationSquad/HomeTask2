package elements;

public class Frame extends Window {

    public Frame(String name, int elementCount, boolean expanded, boolean collapsed) {
        super(name, elementCount, expanded, collapsed);
    }

    @Override
    public void isDisplayed() {
        System.out.println("Frame window is present.");
    }

    @Override
    public void close() {
        System.out.println(this.name + " window closed");
    }
}
