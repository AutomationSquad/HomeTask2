package elements;

public class TextArea extends TextComponent{
    
    @Override
    public void enterText(String text) {
        System.out.println("Entering text in text area " + componentName);
        this.text = text;
    }

    @Override
    public void clearText() {
        System.out.println("Entering text in text area " + componentName);
        this.text = "";
    }

    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in text area " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}