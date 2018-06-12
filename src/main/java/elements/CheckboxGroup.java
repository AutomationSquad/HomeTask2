package elements;

public class CheckboxGroup {
    protected String name;
    protected String position;
    protected boolean status;

    public CheckboxGroup(String name, String position, boolean status) {
        this.name = name;
        this.position = position;
        this.status = status;
    }

    public void clickOnCheckbox(){
        System.out.println(name + " was clicked.");
        System.out.println(name + "`s" + " status is " + status);
    }
}
