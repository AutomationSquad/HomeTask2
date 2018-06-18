package elements;

public class Applet extends Panel {
    private String name = "Applet";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> child of " + super.mainValue);
    }
}
