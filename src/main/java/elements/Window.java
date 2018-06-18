package elements;

public class Window extends Container implements IVisible,IDrageble,IClosable {

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

    @Override
    public void isDisplayed(){
        System.out.println("Window is visible");
    }

    @Override
    public void isdrag(){
        System.out.println("Window is draggable");
    }

    @Override
    public void isclose(){
        System.out.println("Window is closable");
    }

}
