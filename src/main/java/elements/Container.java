package elements;

public class Container extends Component implements IClickable, IHighlightable, ISelectable {

    protected int elementCount;
    protected boolean expanded;
    protected boolean collapsed;

    public Container(String name, int elementCount, boolean expanded, boolean collapsed) {
        super(name);
        this.elementCount = elementCount;
        this.expanded = expanded;
        this.collapsed = collapsed;
    }

    public Container() {
    }

    @Override
    public void click() {
        System.out.println(String.format("Container element %s was clicked", this.name));
    }

    @Override
    public void isHighlighted() {
        System.out.println("Container element was highlighted");
    }

    @Override
    public void select() {
        System.out.println(String.format("Container element %s is selected", this.name));
    }
}