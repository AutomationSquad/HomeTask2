package elements;

public class Label extends Component{

    public String text;
    public String textColor;

    public Label(String name, String text) {
        super(name);
        this.text = text;
        this.textColor = "white";
    }

    public Label(String name, String text, String color) {
        this(name, text);
        this.textColor = color;
    }

}
