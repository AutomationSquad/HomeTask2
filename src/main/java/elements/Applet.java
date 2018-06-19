package elements;

public class Applet extends Panel {
    Applet(String newComponentName, String location, String backgroundColor) {
        super(newComponentName, location, backgroundColor);
    }

    @Override
    public void findLocation() {
        System.out.println("Applet location is found");
    }
}
