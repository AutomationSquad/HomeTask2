package elements;

public class Window extends Container {
    boolean isVisible;


    public Window(String elementName, String someElement, boolean isVisible) {
        super(elementName, someElement);
        this.isVisible = isVisible;
    }

    @Override
    public String getElementName() {
        return this.elementName;
    }
}
