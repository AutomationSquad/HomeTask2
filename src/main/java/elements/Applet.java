package elements;

public class Applet extends Panel implements IClickable, IVisible{

    protected int serialNumber;

    public Applet(String name, int elementCount, boolean expanded, boolean collapsed, int serialNumber) {
        super(name, elementCount, expanded, collapsed);
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void click() {
        System.out.println("Some Java applet is clicked");
    }

    @Override
    public void isDisplayed() {
        System.out.println(String.format("The %1s #%2s is run and displayed.", this.name, this.serialNumber));
    }
}
