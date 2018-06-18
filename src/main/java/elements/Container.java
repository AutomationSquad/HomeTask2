package elements;

public class Container extends Component {
    protected String mainValue = "Container"; //головна змінна даного класу, виведу в чайлд

    @Override
    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + " -> the child of " + super.mainValue);
    }
}
