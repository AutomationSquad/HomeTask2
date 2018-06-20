package elements;

public class Checkbox extends Component{
    public boolean selected;


    public Checkbox(String name, boolean selected) {
        super(name);
        this.selected = selected;
    }

    public void printName() {
        System.out.println("this is: "+ name + "selected:" + selected);

    }
}
