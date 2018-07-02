package elements;

public class Frame extends  Window {

    public int opacity;

    public Frame (String name, int height, int width, int opacity) {
        super(name, height, width);
        this.opacity = opacity;
    }

        public void printName(){
            System.out.println("this is: " + name + "with opacity: " + opacity);
        }

    }

