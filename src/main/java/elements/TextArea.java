package elements;

public class TextArea extends TextComponent {
    private String backgroundColor;

    TextArea(String newComponentName, int newSize, String text, String color, String backgroundColor) {
        super(newComponentName, newSize, text, color);
        this.backgroundColor=backgroundColor;
    }

    public void colorOfBackground(){
        System.out.println("The color of background is " + backgroundColor);
    }


}
