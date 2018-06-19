package elements;

import interfaces.IClickable;

public class Checkbox extends Component implements IClickable {

    public String option;
    private boolean isChecked = false;

    public Checkbox(String name, String option) {
        super(name);
        this.option = option;
        this.isChecked = true;
    }

    public Checkbox(String name, String option, boolean isChecked) {
        this(name, option);
        this.isChecked = isChecked;
    }

    @Override
    public  void click() {
        System.out.println("Click on checkbox " + this.name);
        isChecked = !isChecked;
    }
}
