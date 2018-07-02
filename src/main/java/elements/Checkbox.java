package elements;

import interfaces.ISelectable;

public class Checkbox extends Component implements ISelectable {
    public boolean selected;


    public Checkbox(String name, boolean selected) {
        super(name);
        this.selected = selected;
    }

    public void select(){
        System.out.print("select");
    }

    public void printName() {
        System.out.println("this is: "+ name + "selected:" + selected);

    }
}
