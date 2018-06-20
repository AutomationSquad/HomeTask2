package elements;

public class TextArea extends TextComponent implements IClickable, IEditable{
    boolean isDisabled;
    CheckboxGroup checkboxGroup;

    public TextArea(String elementName, int textComponentLength, boolean isEmpty, String text, boolean isDisabled) {
        super(elementName, textComponentLength, isEmpty, text);
        this.isDisabled = isDisabled;
    }

    @Override
    public String getText() {
        System.out.println("Method is called from the TextArea class");
        return super.getText();
    }

    @Override
    public void addText(String text) {
        checkboxGroup.setDefaultState(true);
        System.out.println("Add text to text area and change the state of checkbox");
    }

    @Override
    public void click() {
        System.out.println("Iclickable method is overriden in TextArea class");
    }

    @Override
    public boolean isEditable() {
        System.out.println("isEditable method is overriden in TextArea class");
        return false;
    }

    @Override
    public void edit() {
        System.out.println("edit method is overriden in TextArea class");
    }
}
