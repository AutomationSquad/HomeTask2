package elements;

public class Window extends Container {

    public Window(int width, int height, String name) {
        super(width, height, name);
    }

    @Override
    public void hasobjects(int count){
        System.out.println("Window has: "+count+" objects");
    }

    public void open(Boolean open){
        System.out.println("Window is open: "+open);
    }

    public void close(Boolean close){
        System.out.println("Window is close: "+close);
    }

}
