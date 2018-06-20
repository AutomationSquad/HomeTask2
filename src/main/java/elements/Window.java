package elements;

public class Window extends Container {
    public int height;
    public int width;

    public Window (String name, int height, int width){
        super(name);
        this.height = height;
        this.width = width;

    }


//    @Override
    public void printName(){
        System.out.println("this is: "+ name + "with size: " + height  + "*" + width);

    }

}
