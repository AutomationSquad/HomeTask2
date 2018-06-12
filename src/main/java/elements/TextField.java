package elements;

public class TextField extends TextComponent {
    public TextField(String name){
        this.name=name;
    }

    @Override
    public void textIsAligned(){
        System.out.println(name + ": text is aligned");

    }
}
