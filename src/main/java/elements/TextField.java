package elements;

public class TextField extends TextComponent {

    public TextField(int width, int height, String text) {

        super(width, height, text);
    }
    @Override
    public void setSize (int width, int height) {
        System.out.println("TextField size is: " + width + " - width " + height + " - height");
    }
}
