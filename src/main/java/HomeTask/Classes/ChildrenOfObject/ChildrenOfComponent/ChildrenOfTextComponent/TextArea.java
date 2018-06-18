package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfTextComponent;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.TextComponent;
import HomeTask.Interfaces.*;

import java.util.Scanner;

public class TextArea extends TextComponent implements Ifocusable, Ivisible {

    public TextArea(String name) {
        this.name = name;
    }

    @Override
    public void focus() {
        if (visibl) {
            System.out.println("Enter the text:");
            Scanner sc = new Scanner(System.in);
            text += sc.nextLine() + "\n";
        } else System.out.println("The '" + name + "' isn't visible!!");
    }

}
