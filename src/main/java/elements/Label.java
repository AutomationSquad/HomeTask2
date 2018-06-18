package elements;

public class Label extends Component implements IVisible{

    public Label(int width, int height) {
    }

    public void getId (int id) {
        System.out.println("Label id - " + id);
    }

    @Override
    public void isDisplayed() {

    }

    @Override
    public void getText() {
        System.out.println("Label text");

    }
}
