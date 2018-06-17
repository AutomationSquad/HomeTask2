package elements;

public class Panel extends Container implements IVisible, IClickable, IHighlightable {

    public Panel(String name, int elementCount, boolean expanded, boolean collapsed) {
        super(name, elementCount, expanded, collapsed);
    }

    @Override
    public void isHighlighted() {
        System.out.println("Elements panel is highlighted");
    }

    @Override
    public void isActive() {
        System.out.println(String.format("%s is active and contains some elements.", this.name));
        super.isActive();
    }

    @Override
    public boolean isComponentPresent() {
        System.out.println(this.name + "panel is present in a viewport.");
        return super.isComponentPresent();
    }
}
