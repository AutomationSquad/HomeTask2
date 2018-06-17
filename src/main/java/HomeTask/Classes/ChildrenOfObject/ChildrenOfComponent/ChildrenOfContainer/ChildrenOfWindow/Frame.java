package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.Window;
import HomeTask.Interfaces.*;

public class Frame extends Window implements Ifocusable, Ivisible, Idraggable {
    public boolean hasFavicon = false;

    public Frame(String name) {
        super(name);
    }

    public void placeFavicon() {
        System.out.println("The " + name + " has its own favicon!!");
        hasFavicon = true;
    }

    @Override
    public void focus() {
        if(visibl & hasFavicon) {

            inFocus = !inFocus;
            if (inFocus)
                System.out.println(name + " is in focus");
            else System.out.println(name + " isn't in focus");

        }else System.out.println("The " + name + " isn't set up correct!! Please, place its favicon and open the " + name);
    }
}
