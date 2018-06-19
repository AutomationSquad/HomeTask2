package elements;

public class TextComponent extends Component {
    String name;
    public  TextComponent(){
    }

    public TextComponent(String name){
        this.name=name;
    }
    @Override
    public void focus(){
        System.out.println(name + " in focus");
    }

    public void textIsAligned(){
        System.out.println(name + ": text is aligned");

    }
}
