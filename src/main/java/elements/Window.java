package elements;

import interfaces.IClosable;
import interfaces.IDraggable;
import interfaces.IVisible;

public class Window extends Container implements IVisible, IDraggable, IClosable {
    public int height;
    public int width;

    public Window (String name, int height, int width){
        super(name);
        this.height = height;
        this.width = width;

    }

    public void isDisplayed() {
        System.out.print("visible");
    }

    public void drag(){
        System.out.print("drag");
    }

    public void close(){
        System.out.print("close");
    }


//    @Override
    public void printName(){
        System.out.println("this is: "+ name + "with size: " + height  + "*" + width);

    }

}
