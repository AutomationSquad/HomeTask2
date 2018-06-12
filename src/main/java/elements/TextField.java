package elements;

public class TextField extends TextComponent {
    private int length;

    public TextField(int length) {
        this.length = length;
    }

    @Override
    public void displayInputText(){
        System.out.println("Display input text in one line.");
    }
}
