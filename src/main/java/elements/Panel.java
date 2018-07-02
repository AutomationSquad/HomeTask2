package elements;

import interfaces.IScrollable;

public class Panel extends Container implements IScrollable {

    public int margin;

    public Panel (String name, int margin){
        super(name);
        this.margin = margin;

    }

    public void scroll(){
        System.out.print("scroll");
    }

    public void printName(){
        System.out.println("this is: "+ name);

    }

    public void printMargin(){
        System.out.println("margin: "+ margin);
    }
}
