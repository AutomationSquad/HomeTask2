package elements;

public class Dialog extends Window {

    public Dialog(String elementName, String someElement, boolean isVisible) {
        super(elementName, someElement, isVisible);
    }

    @Override
    public void someAction() {
        System.out.println("some action from Dialog class");
    }


}
