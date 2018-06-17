package elements;

public abstract class Component implements IVisible {

    public String name;
    public boolean availability;

    public Component(String name) {
        this.name = name;
        this.availability = true;
    }

    public Component() {
    }

    @Override
    public void isDisplayed() {
        System.out.println(String.format("The %s component is displayed on a page.", this.name));
    }

    @Override
    public void isActive() {
        System.out.println(this.name + " is active on a page!");

    }

    public boolean isComponentPresent() {
        if (name != null) {
            System.out.println(String.format("%s component is present!", name));
            return true;
        } else {
            System.out.println(String.format("%s component is NOT present!", name));
            return false;
        }
    }

    public void highlightComponent() {
        System.out.println(String.format("Component %s is highlighted on the page.", name));
    }
}
