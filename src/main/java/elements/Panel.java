package elements;

public class Panel extends Container {
    public String namePanel;
    public Button button1;
    public Button button2;
    public TextField field1;
    public TextField field2;

    public Panel(Button button1, Button button2, TextField field1, TextField field2, String name, int width, int height) {
        super(name, width, height);
        this.name = namePanel;
        this.button1 = button1;
        this.button2 = button2;
        this.field1 = field1;
        this.field2 = field2;
    }

}

