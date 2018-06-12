package elements;

public class Checkbox extends CheckboxGroup{

    public Checkbox(String name, String position, boolean status) {
        super(name, position, status);
    }

    @Override
    public void clickOnCheckbox() {
        System.out.println(name + " was clicked.");
        System.out.println(name + "`s" + " status is " + status);
        System.out.println(name + "`s" + " position is " + position);
    }
}
