package elements;

public class Panel extends Container {

    public int margin;

    public Panel (String name, int margin){
        super(name);
        this.margin = margin;

    }

    public void printName(){
        System.out.println("this is: "+ name);

    }

    public void printMargin(){
        System.out.println("margin: "+ margin);
    }
}
