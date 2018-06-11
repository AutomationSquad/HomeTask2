package elements;

public class Container extends Component {
    public Container(int width, int height, String text) {
        super(width, height, text);
    }
    public void setContent(String content) {
        System.out.println("Content - " + content);
    }
}
