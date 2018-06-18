package elements;

public abstract class Options {

    private int x;
    private int y;

    public Options(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getOptions() {
        System.out.println("Option 1 is: " + x + "; " + "Option 2 is: " + y);
    }

    public abstract int getOptionSettings ();
}