package elements;

public class TextField extends TextComponent {
    public String nameTextField;

    public TextField(String name, String fieldContent, int width, int height){
        super (name, fieldContent, width, height);
        this.name = nameTextField;

    }

    @Override
    public void textPrint(){
        System.out.print("Print" + fieldContent);
    }


}
