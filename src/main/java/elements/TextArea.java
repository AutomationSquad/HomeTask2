package elements;

import Interfaces.IVisible;

public class TextArea extends TextComponent implements IVisible {

    private int length;


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void visible() {
        System.out.println("Text Area is visible");
    }

}
