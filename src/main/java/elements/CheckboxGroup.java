package elements;

public class CheckboxGroup {
    public String name;
    public boolean status;

    public CheckboxGroup(boolean status){
        this.name = name;
        this.status = status;
    }

    public void statusCheckbox () {
        System.out.print(name + "is" + status);
    }


}
