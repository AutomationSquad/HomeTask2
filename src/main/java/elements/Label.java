package elements;

public class Label extends Component {
    public Label(int width, int height) {
        super(width, height);
    }

    public void getId (int id) {
        System.out.println("Label id - " + id);
    }

}
