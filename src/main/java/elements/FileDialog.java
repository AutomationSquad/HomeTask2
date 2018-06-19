package elements;

import Interfaces.IClosable;
import Interfaces.IScrollable;

public class FileDialog extends Dialog implements IClosable, IScrollable {

    private Button b;


    public Button getB() {
        return b;
    }

    public void setB(Button b) {
        this.b = b;
    }

    @Override

    public void close() {
        System.out.println(b);
    }

    @Override

    public void scroll () {
        System.out.println(b);
    }


}