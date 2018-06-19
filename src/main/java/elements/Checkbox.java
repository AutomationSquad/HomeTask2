package elements;

import Interfaces.IClickable;
import Interfaces.ISelectable;
import Interfaces.IVisible;

public class Checkbox extends Component  implements ISelectable, IClickable, IVisible{

    private boolean b = true;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }


    public Checkbox (Boolean b1) {
        this.b = false;
    }

    void displayCheckbox() {

        System.out.println("Checkbox has " + b);
    }

    @Override

    public void select() {
        System.out.println("The checkbox is selected");
    }

    @Override

    public void click() {
        System.out.println("The checkbox is clicked");
    }

    @Override

    public void visible() {
        System.out.println("The checkbox is visible");
    }

}