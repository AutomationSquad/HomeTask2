package elements;

public class Applet extends Panel {
    String title;
    Label welcome;
    TextArea aboutUs;
    Button contact;
    Button close;

    public Applet(String title, Label welcome, TextArea aboutUs, Button contact, Button close) {
        this.title = title;
        this.welcome = welcome;
        this.aboutUs = aboutUs;
        this.contact = contact;
        this.close = close;
    }

    public void printPage() {
        System.out.println(this.title + "\n" + this.welcome.title + "\n" + this.aboutUs.text + "\n" + this.close.title);
    }
}