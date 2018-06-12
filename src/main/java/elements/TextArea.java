package elements;

public class TextArea extends TextComponent {

    private int length;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    void displayTextComponent() {
        System.out.println("Text Area");
    }

}
