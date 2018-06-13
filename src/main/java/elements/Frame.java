package elements;

public class Frame extends Window {
    public String nameFrame;

    public Frame (String name, int width, int height){
        super(name, width, height);
        this.name = nameFrame;
    }

    @Override
    public void selectComponent () {
        System.out.println(nameFrame + "selected");
    }

    @Override
    public void addWindow (){
        System.out.print("The" + nameFrame + "is added");
    }
}
