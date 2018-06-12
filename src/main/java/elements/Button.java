package elements;

public class Button extends Component{
    
    @Override
    public void click() {
        System.out.println("Clicked on button " + componentName);
    }

    public void click(int count) {
        count = (count <=0 ) ? 1 : count;
        for (int i = 0; i < count; i++) System.out.println("Clicked on button " + componentName);
    }

    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in button " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}