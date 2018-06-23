package elements;

import interfaces.IVisible;

public class TextArea extends TextComponent implements IVisible {
    String title = "TextArea";
    String text;

    public TextArea(String text) {
        this.text = text;
    }

    public void visible() {
        System.out.println(title + " is visible");
    }
}
