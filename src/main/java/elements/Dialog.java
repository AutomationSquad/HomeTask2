package elements;

public class Dialog extends Window {
    private String appletColor;

    Dialog(String newComponentName, String location, String size, String appletColor) {
        super(newComponentName, location, size);
        this.appletColor=appletColor;
    }


    @Override
    public void findLocation() {
        System.out.println("Applet location is found");
    }
    public void getColor(){
        System.out.println("Applet color is " + appletColor);
    }

    @Override
    public void close() {
        System.out.println("Dialog is closed");
    }

    @Override
    public void drag() {
        System.out.println("Dialog was moved");
    }
}
