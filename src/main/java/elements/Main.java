package elements;

public class Main {

    public static void main(String[] args) {

        Button button = new Button(10, 20, "Button");
        button.click();

        TextField login = new TextField(100, 20, "login");
        TextField password = new TextField(100, 20, "password");
        login.inputText();
        password.inputText();
        login.setSize(30, 10);

        Checkbox checkbox = new Checkbox (40,50);
        checkbox.check(3);
        checkbox.unCheck(2);
        checkbox.isSelected();
        checkbox.scrollUp();
        checkbox.scrollDown();

        TextArea textArea = new TextArea(100, 50, "TextArea");
        textArea.setRowsCount(5);
        textArea.inputText();
        TextComponent textArea2 = new TextArea(200, 100, "TextArea");

        Frame frame = new Frame(100, 200, "Frame");
        frame.setColsCount(20);
        frame.openWindow(frame);

        Panel panel = new Panel(40, 768, "Panel");
        panel.setColor("Grey");
        panel.setContent("images");

        Window dialog = new Dialog(60, 40, "Dialog window");
        dialog.getText();
        dialog.openWindow(dialog);

        TextComponent text = new TextField(60, 20, "TextField");
        text.inputText();

        Panel applet = new Applet(20, 100, "Applet");
        applet.setColor("Blue");

        Label label;
        label = new Label(20, 20);
        label.getId(5);
    }
}
