package elements;

import interfaces.ISelectable;

public class CheckboxGroup implements ISelectable {
    private String checkboxName;
    private boolean checkboxState;

    CheckboxGroup(String newCheckboxName, boolean checkboxState) {
        this.checkboxName = newCheckboxName;
        this.checkboxState = checkboxState;

    }

    public void clickOnCheckbox(){
            System.out.println("checkbox is checked");
    }
    public void getCheckboxName(){
        System.out.println("Checkbox title is " + checkboxName);
    }

    @Override
    public void select() {
        System.out.println("Checkbox is selected");
    }
}
