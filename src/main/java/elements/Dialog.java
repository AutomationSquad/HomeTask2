package elements;

public class Dialog extends Window {
    String dialogTitle;
    TextArea text;
    Checkbox callBack;
    Button submit;
    Button close;

    public Dialog(String dialogTitle, TextArea text, Checkbox callBack, Button submit, Button close) {
        this.dialogTitle = dialogTitle;
        this.text = text;
        this.callBack = callBack;
        this.submit = submit;
        this.close = close;
    }

    public void printPage() {
        System.out.println(this.dialogTitle +
                "\n" + this.text.text +
                "\n" + this.callBack.title +
                "\n" + this.submit.title +
                "\n" + this.close.title);
    }
}
