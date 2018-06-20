package elements;

public class Button extends Component {
    boolean isActive;

    public Button(String elementName, boolean isActive) {
        super(elementName);
        this.isActive = isActive;
    }

    public static void click(String elementName) {
        System.out.println("Button is clicked");
    }

    @Override
    public String getElementName() {
        System.out.println("Returns button name " + this.elementName);
        return this.elementName;
    }
}
