package elements;

public class TextComponent extends Component {

    public String nameTextComponent;
    public String fieldContent;

    public TextComponent(String name, String fieldContent, int width, int height) {
        super(name, width, height);
        this.name = nameTextComponent;
        this.fieldContent = fieldContent;
    }

    @Override
    public void selectComponent(){
        System.out.print(nameTextComponent + "with width" + width + "and height" + height + "selected");
    }


    public void textPrint (){
        System.out.print ("Print" + fieldContent);

    }


}
