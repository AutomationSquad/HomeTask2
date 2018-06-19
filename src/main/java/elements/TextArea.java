package elements;

public class TextArea extends TextComponent{

    public TextArea(String name){
        this.name=name;
    }

    @Override
    public void textIsAligned(){
        System.out.println(name + ": text is aligned");

    }
}
