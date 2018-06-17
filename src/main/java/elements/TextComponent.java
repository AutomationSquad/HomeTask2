package elements;

public class TextComponent extends Component {

    protected boolean isEmpty;
    protected Integer textLength;
    protected String text;

    public TextComponent(String name, boolean isEmpty, Integer textLength, String text) {
        super(name);
        this.isEmpty = isEmpty;
        this.textLength = textLength;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.isEmpty = false;
        this.text = text;
        System.out.println("Text is added, TextComponent is not empty.");
    }

    public void deleteText() {
        this.isEmpty = true;
        System.out.println("Text is deleted, TextComponent is empty.");
    }
}
