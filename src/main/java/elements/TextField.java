package elements;

import interfaces.ITypeValue;

public class TextField extends TextComponent implements ITypeValue {

    private String name = "TextField";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName()+ "-> 2nd child of " + super.mainValue);
    }
}
