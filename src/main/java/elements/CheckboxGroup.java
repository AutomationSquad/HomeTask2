package elements;

import interfaces.IClickable;

public class CheckboxGroup {

    public Checkbox[] checkboxes;
    public String name;

    public CheckboxGroup(String name, Checkbox[] checkboxes) {
        this.name = name;
        this.checkboxes = checkboxes;
    }

    public void click(int indexOfCheckbox) {
        try {
            checkboxes[indexOfCheckbox].click();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such index of checkbox in " + this.name);
        }
    }

}
