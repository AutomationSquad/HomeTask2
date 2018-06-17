package HomeTask.Classes.ChildrenOfObject;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.CheckBox;
import HomeTask.Classes.MyObject;
import HomeTask.Interfaces.Ivisible;

import java.util.ArrayList;


public class CheckboxGroup extends MyObject implements Ivisible {

    public ArrayList<CheckBox> elements = new ArrayList<>();


    public CheckboxGroup(String name) {
        this.name = name;
    }

    public void printAllElements() {
        System.out.print("The '" + name + "' checkbox group consist from:");
        for (CheckBox el : elements) {
            System.out.print(" " + el.name);
        }
    }

    public void addElement(CheckBox elem) {
        elements.add(elem);
    }
}
