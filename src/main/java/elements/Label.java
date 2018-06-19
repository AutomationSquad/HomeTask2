package elements;

public class Label extends Component {

    @Override
    public void focus(){
        System.out.println(name + " in focus");
    }

    public void visible(){
        System.out.println(name + " visible");

    }

}
