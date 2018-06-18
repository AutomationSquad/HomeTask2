package elements;

import interfaces.IDrageble;

public class Container extends Component implements IDrageble {

    protected int elementsInside;
    public Container(String name, int elementsInside){
     this.name = name;
     this.elementsInside = elementsInside;
    }

    public Container() {
    }

    @Override
    public void highlightComponent(){
        System.out.println(name + " is highlighted.");
        System.out.println(name + " is container");
    }

    public void storeElements(int elementsInside){
        System.out.println(name + " contains " + elementsInside + " elements inside");
    }

    @Override
    public void drag() {
        this.highlightComponent();
    }
}
