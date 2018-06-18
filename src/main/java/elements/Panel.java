package elements;

public class Panel extends Container {
    protected String mainValue = "Panel";

    @Override
    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + "-> 1st child of " + super.mainValue);
    }
}
