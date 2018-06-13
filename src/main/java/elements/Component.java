package elements;

public class Component {

    public String name;
    public int width;
    public int height;

    public Component(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;

    }

    public void selectComponent () {
        System.out.println(name + "selected");
    }

}
