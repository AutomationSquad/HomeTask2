package elements;

public class CheckboxGroup {

    public String title;
    public boolean checked;

    public CheckboxGroup(boolean checked, String title) {
        this.title = title;
        this.checked = checked;
    }

    public void printParams() {
        System.out.println("this is: "+ title + "checked:"+ checked );

    }
}
