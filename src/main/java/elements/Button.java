package elements;

public class Button extends Component implements IClickable, IVisible {

    protected boolean isVisible;

    public Button(String name, boolean isVisible) {
        super(name);
        this.isVisible = isVisible;
    }

    @Override
    public void isActive() {
        super.isActive();
    }

    @Override
    public boolean isComponentPresent() {
        System.out.println(String.format("Button %s is present on a page.", this.name));
        return true;
    }

    @Override
    public void highlightComponent() {
        System.out.println("Button element is highlighted.");
    }

    @Override
    public void click() {
        System.out.println("Button " + this.name + " was clicked");
    }
}
