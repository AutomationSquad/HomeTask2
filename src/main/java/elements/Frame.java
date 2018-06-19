package elements;

import Interfaces.IClosable;
import Interfaces.IDragable;
import Interfaces.IScrollable;

public class Frame extends Window implements IScrollable, IClosable, IDragable{

    private boolean b2;


    public boolean isB2() {
        return b2;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    Frame(boolean b3) {
        System.out.println(false);;
    }

    @Override

    public void scroll() {

        System.out.println("The frame is scrolled");
    }

    @Override

    public void close() {

        System.out.println("The frame is closed");
    }

    @Override

    public void drag() {

        System.out.println("The frame is draged");
    }



}