package elements;

public class Button extends Component {

    public Button(int width, int height, String text) {
        super(width, height, text);
    }

    public void click () {

        System.out.println("button is clickable");
    }


}
