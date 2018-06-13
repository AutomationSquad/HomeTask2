package elements;

public class Window extends Container {

    public String nameWindow;

    public Window (String name, int width, int height){
        super(name, width, height);
        this.name = nameWindow;
    }

    public void addWindow (){
        System.out.print("The window is added");
    }
}
