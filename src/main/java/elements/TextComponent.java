package elements;

public class TextComponent extends Component {
    String text;

    public TextComponent(int width, int height, String text) {

        super(width, height, text);
    }

    public void inputText (String text) {
        System.out.println("TextComponent contains text " + text);

    }
    }
