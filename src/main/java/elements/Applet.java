package elements;

import Interfaces.IClosable;
import Interfaces.IVisible;

public class Applet extends Panel implements IVisible, IClosable {

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

    @Override

    public void visible() {

        System.out.println("Applet is visible");
    }

    @Override

    public void close () {

        System.out.println("Applet is closed");
    }


}