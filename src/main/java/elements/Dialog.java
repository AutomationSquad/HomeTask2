package elements;

import interfaces.IScrollable;

public class Dialog extends Window implements IScrollable{
    public Dialog(String name, Button closeButton, Button collapseButton, Button expandButton) {
        super(name, closeButton, collapseButton, expandButton);
    }

    public void hideDialog(){
        System.out.println("Dialog was hidden.");
    }

    @Override
    public void highlightComponent(){
        System.out.println(name + " is selected.");
    }

    @Override
    public void scrollUp() {
        System.out.println("Scroll Up");
    }

    @Override
    public void scrollDown() {
        System.out.println("Scroll Down");
    }
}
