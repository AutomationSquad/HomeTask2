package elements;

public class Frame extends Window {
    private String bordercolor;
    private boolean frameborder;

    Frame(String newComponentName, String location, String size, String bordercolor, boolean frameborder) {
        super(newComponentName, location, size);
        this.bordercolor=bordercolor;
        this.frameborder=frameborder;
    }

    public void getBorderColor(){
        System.out.println("Border color is " + bordercolor);
    }

    public boolean isFrameBorder(boolean frameborder){
        return frameborder;
    }
}
