package elements;

public class Button extends Component{

    public Button (String name, int width, int height) {
        this.name = name;
        this.wight = width;
        this.height = height;
    }

    @Override
    public void selectComponent (){
        System.out.print(name + "selected with width" + wight + "and height" + height);
    }
}
