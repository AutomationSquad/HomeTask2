package elements;

public class Frame extends Window{
    private String name = "Frame";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> 1st child of " + super.mainValue);
    }
}
