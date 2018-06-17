package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent;

import HomeTask.Classes.ChildrenOfObject.*;
import HomeTask.Interfaces.*;


import java.util.Scanner;

public abstract class TextComponent extends Component implements Ifocusable, Ivisible {

    public String text;

    public void printText() {
        if (text != null)
            System.out.println("The content of the '" + name + "' " + getClass().getSimpleName().toLowerCase() + " is " + text);
        else System.out.println("The " + name + " does not have any content");
    }

    @Override
    public void focus() {
        if (visibl) {
            System.out.println("Enter the text:");
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
        } else System.out.println("The " + name + " isn't visible!!");
    }


}
