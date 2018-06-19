package elements;

import interfaces.IClickable;
import interfaces.IDraggable;
import interfaces.IScrollable;

import java.util.ArrayList;
import java.util.List;

public class Window extends Container implements IScrollable, IDraggable{

    public String title;
    public List<Label> labels = new ArrayList<>();
    public List<CheckboxGroup> checkboxGroup = new ArrayList<>();
    public List<IClickable> clickables = new ArrayList<>();
    private Button altTabButton = new Button("altTabButton", "Alternate");

    public Window(String name, String title) {
        super(name);
        this.title = title;
    }

    public void alterntane() {
        this.altTabButton.click();
        this.isInFocus = false;
        System.out.println("Alternated from " + this.name);

    } //alttab() ???

    public void dragTo(int x, int y) {
        System.out.println("Dragging " + this.name + " to " + this.posX + " " + this.posY);
    }

    public void scrollTo(Component c) {
        System.out.println("Scrolled to " + c.name);
    }

    // for not overfilling constructor
    public void addCheckboxGroup(CheckboxGroup checkboxGroup) {
        this.checkboxGroup.add(checkboxGroup);
    }

    public void addLabel(Label label) {
        this.labels.add(label);
    }

    public void addClickable(IClickable clickable) {
            this.clickables.add(clickable);
    }


}
