package elements;

public class Label extends Component{

    @Override
    public void click() {
        System.out.println("Clicked on label " + componentName);
    }

    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in label " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}