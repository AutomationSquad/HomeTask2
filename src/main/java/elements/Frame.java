package elements;

public class Frame extends Window {

    public Frame(int width, int height, String text) {
        super(width, height, text);
    }
    public void setColsCount(int colsCount) {
        System.out.println("Frame contains " + colsCount + " columns");
    }
}
