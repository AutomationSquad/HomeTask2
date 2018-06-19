package elements;

import Interfaces.IClosable;
import Interfaces.IDragable;
import Interfaces.IScrollable;

public class Dialog  extends Window implements IClosable, IDragable, IScrollable {

    private String s;

    @Override

    public void close() {

        System.out.println("close button " + s );

    }

    @Override

    public void drag () {

        System.out.println("drag button " + s);
    }

    @Override

    public void scroll () {

        System.out.println("scroll button " + s);
    }


    }