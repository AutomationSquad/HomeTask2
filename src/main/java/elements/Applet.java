package elements;

public class Applet extends Panel {

    public Applet(int width, int height, String name) {
        super(width, height, name);
    }

    @Override
    public void transparency(int percent){
        System.out.println("Applet transparency: "+ percent+" percent");

    }
}
