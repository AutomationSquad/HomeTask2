package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfTextComponent;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.TextComponent;
import HomeTask.Interfaces.*;


public class TextField extends TextComponent implements Ifocusable, Ivisible {


    public TextField(String name) {
        this.name = name;
    }

}
