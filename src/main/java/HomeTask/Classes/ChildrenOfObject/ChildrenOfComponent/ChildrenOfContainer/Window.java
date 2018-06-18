package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.Container;
import HomeTask.Interfaces.*;

public class Window extends Container implements Ifocusable, Ivisible, Idraggable {

    public int coordX = 0;
    public int coordY = 0;

    public Window(String name) {
        super(name);
    }

    public void getCoordinate() {
        System.out.println("The coordinate of the '" + name + "' is (" + coordY + "; " + coordY + ")");
    }

    @Override
    public void changeVisible() {
        visibl = !visibl;
        if (visibl)
            System.out.println("'" + name + "' is open");
        else System.out.println("'" + name + "' is closed");
    }

    @Override
    public void focus() {
        if (visibl) {

            inFocus = !inFocus;
            if (inFocus) System.out.println("'" + name + "' is in focus");
            else System.out.println("'" + name + "' isn't in focus");

        } else System.out.println("The '" + name + "' isn't open!!");
    }

    @Override
    public void drag(int x, int y) {
        if (visibl & inFocus) {
            coordX = x;
            coordY = y;
            System.out.println("The '" + name + "' is dragged to (" + coordX + "; " + coordY + ")");
        } else if (!inFocus & !visibl) System.out.println("The '" + name + "' isn't in focus and isn't visible");
        else if (!inFocus) System.out.println("The '" + name + "' isn't in focus");
        else System.out.println("The " + name + " isn't visible");
    }
}
