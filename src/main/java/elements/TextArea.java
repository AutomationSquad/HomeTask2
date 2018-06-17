package elements;

public class TextArea extends TextComponent {

    protected String text;

    public TextArea(String name, boolean isEmpty, Integer textLength, String text) {
        super(name, isEmpty, textLength, text);
    }

    @Override
    public void setText(String text) {
        System.out.println("Text set to TextArea component");
        super.setText(text);
    }
}
