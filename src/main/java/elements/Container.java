package elements;

import Interfaces.IVisible;

public class Container extends Component implements IVisible{

    private String titleContainer;

    public Container() {
        this.titleContainer = " New Container";
    }

    public String getTitle() {
        return titleContainer;
    }

    public void setTitle(String title) {
        this.titleContainer = title;
    }

    public void checkContainer() {
        System.out.println("Container tile is " + titleContainer);
    }

    @Override

    public void visible () {

        System.out.println(name + "is visible");
    }


}



