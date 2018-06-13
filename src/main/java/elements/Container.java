package elements;

public class Container extends Component {
    String someElement;

    public Container(String elementName, String someElement) {
        super(elementName);
        this.someElement = someElement;
    }

    public void someAction() {
        System.out.println("Some action in Container class method");
    }

    public void someAction(String someElement) {
        System.out.println("Some action with overloaded method in Container class");
    }
}
