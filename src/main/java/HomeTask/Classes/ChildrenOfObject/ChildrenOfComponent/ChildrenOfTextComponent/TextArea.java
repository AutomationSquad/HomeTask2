package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfTextComponent;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.TextComponent;
import HomeTask.Interfaces.*;

public class TextArea extends TextComponent implements Ifocusable, Ivisible {

    public TextArea(String name) {
        this.name = name;
    }

}
