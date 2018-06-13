package elements;

public class Lable extends Component {
    public int color;

    public Lable (String name, int color, int width, int height){
        super(name, width, height);
        this.color = color;

    }

    @Override
    public void selectComponent (){
        System.out.print(name + "selected. Color:" + color);
    }


}
