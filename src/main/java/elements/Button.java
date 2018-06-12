package elements;

public class Button extends Component {
    public String name;

    public Button(String name){
        this.name=name;
    }
    @Override
    public void focus(){
        System.out.println(name + " in focus");
    }

    public void click(String name){
        System.out.println(name + " clicked");

    }

    public void click(String name,int width){
        System.out.println(name + " clicked "+ "width: "+width);

    }

}
