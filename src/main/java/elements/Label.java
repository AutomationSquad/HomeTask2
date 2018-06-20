package elements;

public class Label extends Component {
    boolean isExist;
    String labelName;

    public Label(String elementName, boolean isExist, String labelName) {
        super(elementName);
        this.isExist = isExist;
        this.labelName = labelName;
    }

    @Override
    public String getElementName() {
        System.out.println("Overrided method from parent class");
        return this.elementName;
    }
}
