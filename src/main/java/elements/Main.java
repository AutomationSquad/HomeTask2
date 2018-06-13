package elements;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new Dialog("dialog", "element", true);
        dialog.getElementName();
        dialog.someAction();

        TextComponent textComponent = new TextComponent("textComponent", 12, false, "TEXT");
        textComponent.addText(textComponent.getText() + " new text");
        textComponent.getText();
        textComponent.removeText();
    }
}
