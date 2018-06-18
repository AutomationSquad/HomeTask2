package elements;

public class Dialog extends  Window{
    protected String mainValue = "Dialog";

    @Override
    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + "-> 2nd child of " + super.mainValue);
    }
}
