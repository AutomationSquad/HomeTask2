package elements;

public class Component {

    String name;
    int width;
    int height;


    public Component() {
        name = "";

    }

    public Component(int width, int height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
        System.out.println(name+" size: width - " + width + ", height - " + height);
    }

    public void focus(){
        System.out.println(name + " in focus");
    }

}
