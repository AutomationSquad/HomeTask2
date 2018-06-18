package elements;

import interfaces.ITypeValue;

public class TextArea extends TextComponent implements ITypeValue {

    private String name = "TextArea";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return (getName() + "-> 1st child of " + super.mainValue);
    }

}
