package elements;

public class Checkbox extends Component implements ISelectable {

    public Checkbox(int width, int height, String name) {
        super(width, height, name);
    }

    @Override
    public void isselect(){
        System.out.println("Checkbox is selectable");
    }
}


