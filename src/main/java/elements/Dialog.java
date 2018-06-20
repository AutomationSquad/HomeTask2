package elements;

public class Dialog extends Window implements IScrollable, IVisible {

    public Dialog(String elementName, String someElement, boolean isVisible) {
        super(elementName, someElement, isVisible);
    }

    @Override
    public void someAction() {
        System.out.println("some action from Dialog class");
    }


    @Override
    public void scrollTo() {
        System.out.println("scrollTo method is overriden in Dialog class");
    }

    @Override
    public void scrollTop() {
        System.out.println("scrollTop method is overriden in Dialog class");
    }

    @Override
    public void scrollBottom() {
        System.out.println("scrollBottom method is overriden in Dialog class");
    }

    @Override
    public boolean isDisplayed() {
        System.out.println("isDisplayed method is overriden in Dialog class");
        System.out.println(isVisible + " - visibility state");
        return isVisible;
    }
}
