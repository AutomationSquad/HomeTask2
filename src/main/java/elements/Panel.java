package elements;

public class Panel extends Container {
    private String backgroundColor;
    Panel(String newComponentName, String location, String backgroundColor) {
        super(newComponentName, location);
        this.backgroundColor=backgroundColor;
    }

    public void getBackgroundColor(){
        System.out.println("Background Color is " + backgroundColor);
    }
}
