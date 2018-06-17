package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent;

import HomeTask.Classes.ChildrenOfObject.Component;
import HomeTask.Classes.MyObject;
import HomeTask.Interfaces.*;
import java.util.ArrayList;


public abstract class Container extends Component implements Ifocusable,Ivisible {

    public boolean inFocus = false;

    public ArrayList<MyObject> elements = new ArrayList<>();

    public Container(String name) {
        this.name = name;
    }

    public void printAllElements(){
        System.out.print("The '"+ name +"' " + this.getClass().getSimpleName().toLowerCase() +" consist from:");
        for (MyObject el: elements) {
            System.out.print(" " + el.name);
        }
    }

    public void addElement(MyObject elem){
        elements.add(elem);
    }


}
