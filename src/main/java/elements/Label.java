package elements;

public class Label extends Component {

    protected boolean highlighted;
    protected int length;

    public Label(String name, boolean availability, boolean highlighted, int length) {
        super(name);
        this.availability = availability;
        this.highlighted = highlighted;
        this.length = 0;
    }



    @Override
    public void highlightComponent() {
        System.out.println(String.format("Label %s is highlighted on the page.", this.name));
    }

    public boolean isHighlighted() {
        System.out.println("The label " + this.name + " highlighted");
        return highlighted;
    }

    public int getLength() {
        System.out.println(String.format("The character count in a label \"%1s\" is: %2s", this.name, this.name.length()));
        return this.name.length();
    }



}
