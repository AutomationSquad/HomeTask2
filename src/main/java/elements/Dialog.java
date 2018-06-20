package elements;

public class Dialog extends Window {
    public String position;

    public Dialog (String name, int height, int width, String position) {
        super(name, height, width);
        this.position = position;
    }

    public void printName(){
        System.out.println("this is: " + name + "position: " + position);
    }


}
