package elements;

public class Checkbox extends CheckboxGroup {
    public String checboxName;

    public Checkbox(String checboxName, boolean status)
    {
        super(status);
        this.name = checboxName;

    }

    @Override
    public void statusCheckbox () {
        System.out.print(checboxName + "is" + status);
    }
}
