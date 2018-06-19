package elements;

public class Label extends Component {

    Label(String newComponentName, int newSize) {
        super(newComponentName, newSize);
    }

    @Override
    public void hoverOnComponent() {
        System.out.println("Label is hovered");
    }
}
