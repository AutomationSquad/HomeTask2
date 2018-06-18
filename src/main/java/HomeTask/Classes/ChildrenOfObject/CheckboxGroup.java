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
        if(!elements.isEmpty()) {

            System.out.print("The '" + name + "'" + getClass().getSimpleName().toLowerCase() + " consist from:");
            for (CheckBox el : elements) {
                System.out.print(" " + el.name);
            }
        }
        else System.out.println("The '" + name + "' doesn't have any elements!!");
    }

    public void addElement(CheckBox elem) {
        elements.add(elem);
    }
}
