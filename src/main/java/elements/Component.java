package elements;

public class Component {

    protected String name;
    protected int wight;
    protected int height;

    public Component(String name, int width, int height){
        this.name = name;
        this.wight = width;
        this.height = height;

    }

    public Component() {
    }

    public void selectComponent (){
        System.out.println(name+"selected");
    }

}
