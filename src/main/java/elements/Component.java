package elements;

public class Component {
    protected String mainValue = "Component";//це головна знінна даного кореневого класу, виведу її  чайлді

    public String getMainValue() {
        return mainValue;
    }

    @Override
    public String toString() {
        return (getMainValue() + " - root class");
    }
}