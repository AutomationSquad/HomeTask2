package elements;

public class TextArea extends TextComponent {
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


}
