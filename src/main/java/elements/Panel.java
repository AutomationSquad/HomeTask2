package elements;

public class Panel extends Container implements IScrollable{

    public Panel(int width, int height, String text) {
    }

    public void setColor (String color) {
       System.out.println("Panel color - " + color);
    }

    @Override
    public void setContent (String content) {
        System.out.println("Panel content - " + content);
    }

    @Override
    public void scrollUp() {
    }

    @Override
    public void scrollDown() {
    }

    @Override
    public void isClosed() {
    }

    @Override
    public void isDisplayed() {
    }
}
