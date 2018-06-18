package elements;

import static java.lang.System.*;

public class Elements {

    private static String defText = "This is a ";         //глобальна змінна для всіх класів
    private static Component component = new Component(); //створення об*єкта Component
    private static Container container= new Container();  //створення об*єкта Container
    private static Panel panel= new Panel();              //створення об*єкта Panel
    private static Window window= new Window();           //створення об*єкта Window
    private static Applet applet= new Applet();           //створення об*єкта Applet
    private static Frame frame = new Frame();             //створення об*єкта Frame
    private static Dialog dialog = new Dialog();          //створення об*єкта Dialog
    private static FileDialog fileDialog = new FileDialog();//створення об*єкта FileDialog
    private static Label label = new Label();              //створення об*єкта Label
    private static Button button = new Button();           //створення об*єкта Button
    private static Checkbox checkbox = new Checkbox();     //створення об*єкта Checkbox
    private static TextComponent textComponent= new TextComponent();  //створення об*єкта TextComponent
    private static TextArea textArea= new TextArea();      //створення об*єкта TextArea
    private static TextField textField= new TextField();   //створення об*єкта TextField

    //CheckboxGroup використовує абстоактний клас (рахує величину для уявної опції)
    private static CheckboxGroup checkboxGroup= new CheckboxGroup(10, 5);   //створення об*єкта CheckboxGroup

    public static void main (String[] args) {
        System.out.println(defText + component);
        System.out.println(defText + checkboxGroup.toString());
        System.out.println(defText + container.toString());
        System.out.println(defText + panel.toString());
        System.out.println(defText + window.toString());
        System.out.println(defText + applet.toString());
        System.out.println(defText + frame.toString());
        System.out.println(defText + dialog.toString());
        System.out.println(defText + fileDialog.toString());
        System.out.println(defText + label.toString());
        System.out.println(defText + button.toString());
        System.out.println(defText + checkbox.toString());
        System.out.println(defText + textComponent.toString());
        System.out.println(defText + textArea.toString());
        System.out.println(defText + textField.toString() + "\n\n");

        //using of interfaces are below
        label.click();
        label.display();
        label.select();
        System.out.println();

        textComponent.click();
        textComponent.display();
        System.out.println();

        checkbox.select();
        System.out.println();

        button.close();
        button.click();
        button.display();
        System.out.println();

        window.close();
        window.display();
        window.drag();
        System.out.println();

        checkboxGroup.select();
        System.out.println();

        out.println(textField.getName() + " entered value: " + textField.typeSomeValue()); //пробую  вивести, коли інтерфейс повертає не пусте значення
        out.println(textArea.getName() + " entered value: " + textArea.typeSomeValue());
        System.out.println();

        fileDialog.click();
        fileDialog.display();
        fileDialog.select();
        out.println(fileDialog.getName() + " entered value: " + fileDialog.typeSomeValue());

        //--------Виведення даних абстрактного класу через CheckboxGroup---------
        System.out.println("\n" + checkboxGroup.getName() + " option is using such options' values (Abstract class): ");
        checkboxGroup.getOptions();
        System.out.println("Multiplication of option1 to option2 is: " + checkboxGroup.getOptionSettings());

     }
}
