package elements;

public class Dialog extends Window {
    public Dialog(int width, int height, String name) {
        super(width, height, name);
    }
    @Override
    public void open(Boolean open){
        System.out.println("Dialog is open: "+open);
    }
    @Override
    public void close(Boolean close){
        System.out.println("Dialog is close: "+close);
    }

}
