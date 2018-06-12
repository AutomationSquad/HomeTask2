package elements;



public class CheckboxGroup extends Object {

    private boolean checked; //isTrue - checkbox is checked, isFalse - checkbox is unchecked

    public String name;

    CheckboxGroup() {

        this.checked = true;
    }


    boolean isChecked() {
        return checked;
    }

    void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void displayCheckboxGroup() {
        System.out.println(name + "is selected");
    }

}
