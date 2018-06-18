package elements;

public class Frame extends Window {

    public Frame(int width, int height, String text) {
    }

    public void setColsCount(int colsCount) {
        System.out.println("Frame contains " + colsCount + " columns");
    }

    @Override
    public void drag() {
    }

    @Override
    public void close() {
        System.out.println("Frame is closed");
    }

    @Override
    public void isDisplayed() {
        System.out.println("Frame is displyed");
    }

    @Override
    public void setContent(String content) {
    }
}
