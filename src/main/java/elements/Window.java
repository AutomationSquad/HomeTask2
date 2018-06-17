package elements;

public class Window extends Container implements IVisible, IDraggable, IClosable {

    protected Integer height;
    protected Integer width;
    protected boolean modal;
    protected String name;


    public Window(String name, int elementCount, boolean expanded, boolean collapsed) {
        super(name, elementCount, expanded, collapsed);
    }

    public Window(String name, Integer height, Integer width, boolean modal) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.modal = modal;
    }

    @Override
    public void close() {
        System.out.println(this.name + " was closed!");
    }

    @Override
    public void drag() {
        System.out.println(String.format("The %s window was dragged!", this.name));
    }

    @Override
    public void isDisplayed() {
        System.out.println("Window is present to a user.");
    }

    @Override
    public void isActive() {
        System.out.println(String.format("The %s window is active.", this.name));
    }
}
