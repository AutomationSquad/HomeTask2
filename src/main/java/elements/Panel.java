package elements;

public class Panel extends Container {
    public Panel(int width, int height, String name) {
        super(width, height, name);
    }
    @Override
    public void hasobjects(int count){
        System.out.println("Panel has objects: "+ count);
    }

    public void transparency(int percent){
        System.out.println("Panel transparency: "+ percent+" percent");

    }

}
