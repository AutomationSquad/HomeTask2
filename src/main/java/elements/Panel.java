package elements;

public class Panel extends Container{

    public ArrayList<String> panelElements = new ArrayList<String>();

    @Override
    public void fillContainer(String[] elements) {
        for (String element : elements) {
            System.out.println("Filled panel with " + element);
            containerElements.add(element);
        }
    }
    
    @Override
    public void click() {
        System.out.println("Clicked on panel " + componentName);
    }

    public void click(String element) {
        System.out.println("Clicked on " element + " in panel " + componentName);
    }

}