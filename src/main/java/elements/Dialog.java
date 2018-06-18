package elements;

public class Dialog extends Window {

    public Dialog(int width, int height, String text) {
    }

    @Override
    public void openWindow (Window dialog) {
        System.out.println("Dialog window is opened");
    }

    @Override
    public void close() {
    }

    @Override
    public void isDisplayed() {
    }

    @Override
    public void drag() {
        System.out.println("Dialog window is dragged");
    }

    @Override
    public void setContent(String content) {
    }
}
