package elements;

import interfaces.ISelectable;

public class Checkbox extends Component implements ISelectable {

    private String name = "Checkbox";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> child of " + super.mainValue);
    }

    @Override
    public void select() {
        System.out.println(getName() + " is selected");
    }
}
