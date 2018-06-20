package elements;

public class TextField extends TextComponent{
    public String align;

    public TextField (String name, int size, String align) {
        super(name, size);
        this.align = align;
    }

    @Override
    public void printName(){
        System.out.println("this is: " + name);
    }

    public void printParams() { System.out.println("name: " + name + "size: " + size + "align: "+ align);}


}
