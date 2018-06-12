package elements;

public class Applet extends Window{

    public boolean isActive = false;

    @Override
    public void fillContainer(String[] elements) {
        for (String element : elements) {
            System.out.println("Filled applet with " + element);
            containerElements.add(element);
        }
    }
    
    @Override
    public void click() {
        System.out.println("Clicked on applet " + componentName);
    }

    public void click(String element) {
        System.out.println("Clicked on " element + " in applet " + componentName);
    }

    public void checkIsActive() {
        if (isActive){
            System.out.println(componentName + "is active!");
            return;
        }
        System.out.println(componentName + "is not active!");
    }

}