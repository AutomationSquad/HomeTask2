package elements;

public class TextField extends TextComponent implements IVisible {

    public TextField(int width, int height, String text) {
    }

    @Override
    public void inputText() {
        System.out.println("TextField");
    }

    @Override
    public void setSize (int width, int height) {
        System.out.println("TextField size is: " + width + " - width " + height + " - height");
    }

    @Override
    public void getText() {
        System.out.println("Textfield text");
    }

    @Override
    public void isDisplayed() {
        System.out.println("Text is displayed");
    }
}
