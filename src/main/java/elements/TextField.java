package elements;

public class TextField extends TextComponent {
    private String text;

    TextField(String newComponentName, int newSize, String text, String color) {
        super(newComponentName, newSize, text, color);
    }

    @Override
    public void getTextlenght() {
        System.out.println("TextField length: " + this.text);
    }
}
