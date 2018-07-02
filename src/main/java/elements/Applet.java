package elements;

public class Applet extends Panel {
    public String position;

    public Panel (String name, int margin, String position){
        super(name, margin);
        this.position = position;

    }

    public void printName(){
        System.out.println("this is: "+ name);

    }

    public void printMargin(){
        System.out.println("margin: "+ margin);
    }

    public  void  printPosition(){
        System.out.println("position: "+ position);
    }

}
