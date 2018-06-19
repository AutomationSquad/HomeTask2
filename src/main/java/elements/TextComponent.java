package elements;

public class TextComponent extends Component {
    private String text;
    private String color;

    TextComponent(String newComponentName, int newSize, String text, String color) {
        super(newComponentName, newSize);
        this.text = text;
        this.color = color;
    }

    @Override
    public void hoverOnComponent() {
        System.out.println("TextComponent is hovered");
    }

    public String getText() {
        return text;
    }

    void setText (String text){
        this.text = text;
    }
    public void getTextlenght () {
        System.out.println("TextComponent length: " + text.length());
    }
    public void textColor () {
        System.out.println("TextComponent color:" + color);
    }
}


