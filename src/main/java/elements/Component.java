package elements;

import Interfaces.IClickable;
import Interfaces.IClosable;
import Interfaces.ISelectable;
import Interfaces.IVisible;

public class Component implements IVisible, ISelectable, IClickable, IClosable {

    public String name;

    Component() {

        this.name = "not selected";
    }

    @Override

    public void select() {

        System.out.println(name + "is selected");
    }

    @Override

    public void visible () {

        System.out.println(name + "is visible");
    }


    @Override

    public void click () {

        System.out.println(name + "is clicked");
    }

    @Override

    public void close () {

        System.out.println(name + "is closed");
    }


}