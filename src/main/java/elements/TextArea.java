package elements;

public class TextArea extends TextComponent implements IVisible {
    int rowsCount;

    public TextArea(int width, int height, String text) {
    }

    @Override
    public void inputText() {
        System.out.println("TextArea");
    }

       public void setRowsCount(int rowsCount) {
        int x = rowsCount*2;
        System.out.println("TextArea contains " + x + " rows");
    }

    @Override
    public void isDisplayed() {
        System.out.println("Text is not displayed");
    }

    @Override
    public void getText() {
        System.out.println("TextArea text");
    }
}
