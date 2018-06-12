package elements;

public class Applet extends Panel {

    private String titleApplet;

    public Applet() {
        this.titleApplet = " ";

    }

    public void checkAppletTitle() {

        System.out.println(titleApplet);
    }

    public void checkAppletTitle(String newTitleApplet) {

        System.out.println("Applet1");
    }
}
