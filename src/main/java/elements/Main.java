package elements;

public class Main {
    public static void main(String[] args) {
        TextArea textArea = new TextArea("textArea", 12, false, "etext", false);
        textArea.click();
        textArea.edit();

        Dialog newDialog = new Dialog("Dialog", "element", false);
        newDialog.scrollBottom();
        newDialog.isDisplayed();
    }
}
