package elements;


import Interfaces.ISelectable;
import Interfaces.IVisible;

public class CheckboxGroup implements IVisible, ISelectable {

    private boolean checked; //isTrue - checkbox is checked, isFalse - checkbox is unchecked

    public String name;

    CheckboxGroup() {

        this.checked = true;
    }


        @Override

        public void visible () {

            System.out.println("The CheckboxGroup is visible");

        }

        @Override

        public void select () {

        System.out.println(name + "is selected");
    }

}
