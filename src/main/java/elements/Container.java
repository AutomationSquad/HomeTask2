package elements;

public class Container extends Component {
    public String containerName;

    public Container(String name, int width, int height) {
        super(name, width, height);
        this.name = containerName;
    }

    @Override
    public void selectComponent(){
        System.out.print(containerName + "with width" + width + "and height" + height + "selected");
    }
}
