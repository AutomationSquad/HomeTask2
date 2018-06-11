package elements;

public class Panel extends Container {
    public Panel(int width, int height, String text) {
        super(width, height, text);
    }
    public void setColor (String color) {
        System.out.println("Panel color - " + color);
    }
    @Override
    public void setContent (String content) {
        System.out.println("Panel content - " + content);
    }
}
