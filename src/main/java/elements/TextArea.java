package elements;

public class TextArea extends TextComponent {
    public int rows; // number of rows

    public TextArea (String name, int size, int rows) {
        super(name, size);
        this.rows = rows;
    }

    @Override
    public void printName(){
        System.out.println("this is: " + name);
    }

    public void printParams() { System.out.println("name: " + name + "size: " + size + "rows: "+ rows);}


}
