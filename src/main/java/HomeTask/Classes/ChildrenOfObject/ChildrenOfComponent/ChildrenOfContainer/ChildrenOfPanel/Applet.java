package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfPanel;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.Panel;
import HomeTask.Interfaces.*;

public class Applet extends Panel implements Ifocusable, Ivisible {

    public Applet(String name) {
        super(name);
    }

    @Override
    public void focus() {
        if (visibl) {

            inFocus = !inFocus;
            if (inFocus)
                System.out.println("'" + name + "' start to do some action");
            else System.out.println(name + " stop to do some action");

        } else System.out.println("The '" + name + "' isn't visible!!");
    }
}
