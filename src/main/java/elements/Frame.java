package elements;

public class Frame extends Window {
    public Frame(String title, boolean transparent, boolean borderExists) {
        super.title = title;
        super.transparent = transparent;
        super.borderExists = borderExists;
    }
}