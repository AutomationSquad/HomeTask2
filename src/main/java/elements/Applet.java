package elements;

public class Applet extends Panel {

    public Applet (Button button1, Button button2, TextField field1, TextField field2, String name, int width, int height){
        super(button1, button2, field1, field2, name, width, height);
    }

    public void addElements(){
        System.out.print("Add elements:" + button1 + "," + button2 + "," + field1 + "," + field2);
    }
}
