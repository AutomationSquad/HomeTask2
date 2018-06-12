package elements;

public class Checkbox extends Component{
    
    public boolean isChecked = false;
    @Override
    public void click() {
        if (!isChecked){
            System.out.println("Clicked on checkbox " + componentName + " and it`s checked!");
            isChecked = true;
            return;
        }
            System.out.println("Clicked on checkbox " + componentName + " and it`s not checked!");
            isChecked = false;
    }


    @Override
    public void compareText(String text) {
        System.out.println("Comparing text in checkbox " + componentName);
        if (arg1 == text) {
            System.out.println("Text is the same!");
            return;
        }
            System.out.println("Text is not the same!");
    }

}