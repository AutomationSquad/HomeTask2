package elements;


import Interfaces.IClickable;
import Interfaces.IClosable;
import Interfaces.IVisible;

public class TextComponent extends Component implements IVisible, IClosable, IClickable{

    String textComponent;


    @Override

    public void visible() {
        System.out.println("text component has " + textComponent);
    }

    @Override

    public void close() {
        System.out.println("text component " + textComponent + "closed");
    }

    @Override

    public void click() {
        System.out.println("text component " + textComponent + "clicked");
    }
}