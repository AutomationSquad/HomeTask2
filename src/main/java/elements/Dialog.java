package elements;

public class Dialog extends Window {

    public Dialog(String name, Integer height, Integer width, boolean modal) {
        super(name, height, width, modal);
    }

    @Override
    public void drag() {
        System.out.println(String.format("%s window change own position", this.name));
    }

    @Override
    public void close() {
        System.out.println("Dialog window was closed!");
    }
}
