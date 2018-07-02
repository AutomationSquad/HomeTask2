package elements;

public class Container extends Component {

    public String name;

    public Container(String name) {
        super(name);
        this.name = name;

    }

    @Override
    public void printName(){
        System.out.println("this is: "+ name);
    }

}

