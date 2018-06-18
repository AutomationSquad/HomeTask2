package elements;

public class Button extends Component implements IClickable, IVisible{

    public Button(int width, int height, String text) {

    }

    public void click () {
        System.out.println("button is clicked");
    }


    @Override
    public void isDisplayed() {

    }

    @Override
    public void getText() {

    }
}
