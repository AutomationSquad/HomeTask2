package elements;

public class Component {

    public int posX = 0;
    public int posY = 0;
    public String componentName;
    public String text;


    public Component(String name, String text, int x, int y) {
        this.componentName = name;
        this.text = text;
        this.posX = x;
        this.posY = y;
    }

    public void compareText(String arg1) {
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }


    public void click() {
        System.out.println("Click!");
    }

}