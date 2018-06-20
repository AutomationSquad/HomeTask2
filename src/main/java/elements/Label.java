package elements;

public class Label extends Component {
    public String color;


    public Label(String name, String color) {
        super(name);
        this.color = color;
    }

    public void printName() {
        System.out.println("this is: "+ name + "with color: "+ color);

    }
}
