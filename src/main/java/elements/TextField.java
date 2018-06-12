package elements;

public class TextField extends TextComponent{
    
    @Override
    public void enterText(String text) {
        System.out.println("Entering text in text field " + componentName);
        this.text = text;
    }

    @Override
    public void clearText() {
        System.out.println("Cleraing text in text field " + componentName);
        this.text = "";
    }

    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in text field " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}