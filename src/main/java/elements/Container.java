package elements;

public class Container extends Component{

    public ArrayList<String> containerElements = new ArrayList<String>();

    public void fillContainer(String[] elements) {
        for (String element : elements) {
            System.out.println("Filled container with " + element);
            containerElements.add(element);
        }
    }
    
    @Override
    public void click() {
        System.out.println("Clicked on container " + componentName);
    }

    public void click(String element) {
        System.out.println("Clicked on " element + " in container " + componentName);
    }

}