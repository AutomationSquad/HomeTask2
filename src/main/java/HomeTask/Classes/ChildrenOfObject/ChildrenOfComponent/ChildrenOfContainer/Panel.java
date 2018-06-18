package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.Container;
import HomeTask.Interfaces.*;

public class Panel extends Container implements Ifocusable, Ivisible {

    public Panel(String name) {
        super(name);
    }

    @Override
    public void focus() {
        if (visibl) {

            inFocus = !inFocus;
            if (inFocus)
                System.out.println("'" + name + "' is in focus");
            else System.out.println("'" + name + "' isn't in focus");

        } else System.out.println("The '" + name + "' isn't visible!!");
    }
}
