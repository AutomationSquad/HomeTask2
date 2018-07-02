package elements;

public class TextComponent extends Component {
    public int size; // number of chars

    public TextComponent (String name, int size) {
        super(name);
        this.size = size;
    }

    public void printName(){
        System.out.println("this is: " + name + "with size: " + size);
    }



}
