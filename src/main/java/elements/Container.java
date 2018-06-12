package elements;

public class Container extends Component {

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
}
