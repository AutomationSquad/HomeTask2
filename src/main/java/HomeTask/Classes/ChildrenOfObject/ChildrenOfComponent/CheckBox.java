package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent;

import HomeTask.Classes.ChildrenOfObject.Component;
import HomeTask.Interfaces.*;

public class CheckBox extends Component implements Iselectable, Ivisible {

    boolean checked = false;

    public CheckBox(String name) {
        this.name = name;
    }

    @Override
    public void select() {
        if (visibl) {
            checked = !checked;
            if (checked)
                System.out.println(name + " is selected");
            else System.out.println(name + " is unselected");
        } else System.out.println("The " + name + " isn't visible!!!");
    }
}

