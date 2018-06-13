package elements;

public class TextArea extends TextComponent {

    public String nameTextArea;

    public TextArea(String name, String fieldContent, int width, int height){
        super (name, fieldContent, width, height);
        this.name = nameTextArea;

    }

    @Override
    public void textPrint(){
        System.out.print("Print" + fieldContent);
    }

}
