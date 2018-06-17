package elements;

public class Checkbox extends Component implements IClickable, IVisible {

    protected boolean checkbox_tree;


    public Checkbox(String name, boolean availability, boolean checkbox_tree) {
        super(name);
        this.availability = availability;
        this.checkbox_tree = checkbox_tree;
    }

    @Override
    public void click() {
        System.out.println("Checkbox item was clicked.");

    }

    @Override
    public void isActive() {
        System.out.println("The checkbox " + this.name + " option is active.");
    }
}
