package elements;

import Interfaces.IClosable;
import Interfaces.IDragable;
import Interfaces.IScrollable;

public class Panel extends Container implements IScrollable, IDragable, IClosable {

    private String titlePanel;

    public String getTitlePanel() {
        return titlePanel;
    }

    public void setTitlePanel(String titlePanel) {
        this.titlePanel = titlePanel;
    }

    void checkTitle() {

        System.out.println("Panel title is " + titlePanel);
    }

    @Override

    public void scroll() {

        System.out.println("Panel is available to scroll");
    }

    @Override

    public void drag() {

        System.out.println("Panel is available to drag");
    }

    @Override

    public void close() {

        System.out.println("Panel is available to closed");
    }





}