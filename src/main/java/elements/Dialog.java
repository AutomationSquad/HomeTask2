package elements;

public class Dialog extends Window {
    public Dialog(int width, int height, String text) {
        super(width, height, text);
    }
    @Override
    public void openWindow (Window dialog) {
        System.out.println("Dialog window is opened");
    }
}
