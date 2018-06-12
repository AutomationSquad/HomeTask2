package elements;

public class TextComponent extends Component{
    
    public void enterText(String text) {
        System.out.println("Entering text in " + componentName);
        this.text = text;
    }

    public void clearText() {
        this.text = "";
    }

    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in text component " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}