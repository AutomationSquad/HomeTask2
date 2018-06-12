package elements;

public class Frame extends Window {

    public Frame(int width, int height, String name) {
        super(width, height, name);
    }

    public void widthBorder(int border){
        System.out.println("Frame Width border is: "+border);
    }
}
