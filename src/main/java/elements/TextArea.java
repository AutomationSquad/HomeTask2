package elements;

public class TextArea extends TextComponent {
    int rowsCount;

    public TextArea(int width, int height, String text) {
        super(width, height, text);
    }

    public void setRowsCount(int rowsCount) {
        int x = rowsCount*2;
        System.out.println("TextArea contains " + x + " rows");
    }
}
