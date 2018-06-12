package elements;

public class Label extends Component {

    private String textLabel;


    public String getTextLabel() {
        return textLabel;
    }

    public void setTextLabel(String textLabel) {
        this.textLabel = textLabel;
    }


    public void checkLabel() {
        System.out.println("Text label is " + textLabel);
    }
}
