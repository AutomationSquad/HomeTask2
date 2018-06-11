package elements;

public class Component {
    int width;
    int height;
    String text;
    public Component (int width, int height, String text) {
        this.height = height;
        this.width = width;
        this.text = text;
    }
    public Component (int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setSize(int width, int height) {
        System.out.println("Component size: width - " + width + ", height - " + height);
    }
    public String getText (Component component) {
        return text;
       }

    public static void main(String[] args) {
        Component component = new Component(7, 10, "Component");
        component.setSize(3,6);

        Button button = new Button(10, 20, "Button");
        button.click();

        TextField login = new TextField(100, 20, "login");
        TextField password = new TextField(100, 20, "password");
        login.inputText("login");
        password.inputText("password");
        login.setSize(30, 10);

        Checkbox checkbox = new Checkbox (40,50);
        checkbox.check(3);
        checkbox.unCheck(2);

        Window window = new Window(1200, 800, "window");
        window.setContent("Text");
        component.getText(window);
        window.openWindow(window);

        TextArea textArea = new TextArea(100, 50, "TextArea");
        textArea.setRowsCount(5);
        textArea.inputText("TextArea");
        TextComponent textArea2 = new TextArea(200, 100, "TextArea");

        Frame frame = new Frame(100, 200, "Frame");
        frame.setColsCount(20);
        window.openWindow(frame);

        Container container = new Window(1000, 500, "Window");
        container.setContent("Image");

        Panel panel = new Panel(40, 768, "Panel");
        panel.setColor("Grey");
        panel.setContent("images");

        Window dialog = new Dialog(60, 40, "Dialog window");
        component.getText(dialog);
        dialog.openWindow(dialog);

        TextComponent text = new TextField(60, 20, "TextField");
        text.inputText("TextComponent");

        Panel applet = new Applet(20, 100, "Applet");
        applet.setColor("Blue");

        Label label = new Label(20, 20);
        label.getId(5);
    }
}
