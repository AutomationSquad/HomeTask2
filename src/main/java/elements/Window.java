package elements;

public class Window extends Container {
    public Window(int width, int height, String text) {
        super(width, height, text);
    }
    public void openWindow (Window window) {
        System.out.println("Window is opened");
    }
}
