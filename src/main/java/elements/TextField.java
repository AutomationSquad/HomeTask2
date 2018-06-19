package elements;

public class TextField extends TextComponent implements IScrollable {
    public TextField(String name){
        this.name=name;
    }

    @Override
    public void textIsAligned(){
        System.out.println(name + ": text is aligned");

    }

    @Override
    public void isscroll(){
        System.out.println("TextField is scrollable");
    }
}
