package elements;

public class TextComponent extends Component {
    int textComponentLength;
    boolean isEmpty;
    String text;

    public TextComponent(String elementName, int textComponentLength, boolean isEmpty, String text) {
        super(elementName);
        this.textComponentLength = textComponentLength;
        this.isEmpty = isEmpty;
        this.text = text;
    }

    public int getTextComponentLength() {
        return textComponentLength;
    }

    public void setTextComponentLength(int textComponentLength) {
        this.textComponentLength = textComponentLength;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        this.text = text;
        this.isEmpty = false;
        System.out.println("Text is added, empty state is changed to false");
    }

    public void removeText() {
        this.isEmpty = true;
        System.out.println("Text is removed, empty state is changed to true");
    }
}
