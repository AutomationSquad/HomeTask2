package elements;

public abstract class Component {
    public String title;
    public int width = 15;
    public int height = 15;

    public Component() {
    }

    public void hide() {
        System.out.println("Component is hidden");
    }
}