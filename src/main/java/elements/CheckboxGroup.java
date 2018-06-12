package elements;

public class CheckboxGroup {

    public String checkboxGroupName;
    public ArrayList<String> allOptions = new ArrayList<String>();

    public void selectOptions(String[] options) {
        for (String option : options) {
            System.out.printlin("Selecting " + option + "...");
        }
    }

    public void uncheck() {
        System.out.println("Unchecked all checkboxes!");
    }

    public void printAllOptions() {
        for (String option : allOptions) {
            System.out.printlin("Option: " + option);
        }
    }

}