package elements;

public class Button extends Component{
    public String buttonName;

    public Button (String name, int width, int height) {
        super(name, width, height);
        this.name = buttonName;

    }

    @Override
    public void selectComponent (){
        System.out.print(buttonName + "with width" + width + "and height" + height + "selected");
    }
}
