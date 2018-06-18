package elements;

import java.util.Random;

public class Checkbox extends Component implements IVisible,IScrollable,ISelectable{

    public Checkbox(int width, int height) {

    }

    public void check (int boxCount) {
        System.out.println(boxCount + " are checked");

    }
    public void unCheck(int boxCount) {
        System.out.println(boxCount + " are unchecked");

    }

    @Override
    public void scrollUp() {
        System.out.println("Checkbox is scrolled up");

    }

    @Override
    public void scrollDown() {
        System.out.println("Checkbox is scrolled down");

    }

    @Override
    public void isSelected() {
        System.out.println("Checkbox is selected");

    }

    @Override
    public void isDisplayed() {

    }

    @Override
    public void getText() {

    }
}
