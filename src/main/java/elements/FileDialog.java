package elements;

public class FileDialog extends Dialog{

    private Button b;


    public Button getB() {
        return b;
    }

    public void setB(Button b) {
        this.b = b;
    }

    void clickButton() {
        System.out.println(b);
    }
}
