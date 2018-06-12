package elements;

public class Window extends Container{

    public ArrayList<String> panelElements = new ArrayList<String>();

    @Override
    public void fillContainer(String[] elements) {
        for (String element : elements) {
            System.out.println("Filled window with " + element);
            containerElements.add(element);
        }
    }
    
    @Override
    public void click() {
        System.out.println("Clicked on window " + componentName);
    }

    public void click(String element) {
        System.out.println("Clicked on " element + " in window " + componentName);
    }

    public void clickOnExit() {
        System.out.println("Clicked on exit button in window " + componentName);
    }

}