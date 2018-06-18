package elements;

import interfaces.IClickable;
import interfaces.ISelectable;
import interfaces.IVisible;

public class Panel extends Container implements IVisible, ISelectable{
    private Button button;
    private TextField textField;
    private Label label;

    public Panel(Button button, TextField textField, Label label) {
        this.button = button;
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void select() {
        this.highlightComponent();
    }

    @Override
    public boolean isDisplayed() {
        return true;
    }
}
