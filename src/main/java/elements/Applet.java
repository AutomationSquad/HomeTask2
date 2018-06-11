package elements;

public class Applet extends Panel {
    public Applet(int width, int height, String text) {
        super(width, height, text);
    }
    @Override
    public void setColor(String color) {
        System.out.println("Applet color is " + color);
    }



}
