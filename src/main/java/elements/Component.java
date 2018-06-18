package elements;

public abstract class Component {

    public void setSize(int width, int height) {
        System.out.println("Component size: width - " + width + ", height - " + height);
    }

    public abstract void getText();
}
