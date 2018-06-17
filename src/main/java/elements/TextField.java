package elements;

public class TextField extends TextComponent {

    public TextField(String name, boolean isEmpty, Integer textLength, String text) {
        super(name, isEmpty, textLength, text);
    }

    @Override
    public String getText() {
        System.out.println("Text is taken from TextField.");
        return super.getText();
    }

    @Override
    public void deleteText() {
        System.out.println("Text is deleted from TextField.");
        super.deleteText();
    }

    @Override
    public void isActive() {
        System.out.println("TextField is active.");
    }
}
