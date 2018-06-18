package HomeTask;

import HomeTask.Classes.ChildrenOfObject.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfTextComponent.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfPanel.*;
import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow.ChildrenOfDialog.*;


public class Main {

    public static void main(String[] args) {

        CheckboxGroup chBoxGr = new CheckboxGroup("CHECKBOX GROUP");
        Button but = new Button("BUTTON");
        CheckBox chBox = new CheckBox("CHECKBOX");
        Label lab = new Label("LABEL");
        TextArea txtAr = new TextArea("TEXT AREA");
        TextField txtFld = new TextField("TEXT FIELD");
        Panel pan = new Panel("PANEL");
        Window wind = new Window("WINDOW");
        Applet appl = new Applet("APPLET");
        Dialog dial = new Dialog("DIALOG");
        Frame frame = new Frame("FRAME");
        FileDialog filDial = new FileDialog("FILEDIALOG");

        chBoxGr.changeVisible();
        chBoxGr.printAllElements();
        chBoxGr.addElement(new CheckBox("CHECKBOX228"));
        chBoxGr.addElement(new CheckBox("CHECKBOX322"));
        chBoxGr.changeVisible();
        chBoxGr.printAllElements();

        System.out.println("\n");

        but.printName();
        but.click();

        System.out.println("\n");

        chBox.printName();
        chBox.select();
        chBox.changeVisible();
        chBox.select();

        System.out.println("\n");

        lab.printName();
        lab.click();

        System.out.println("\n");

        txtAr.printName();
        txtAr.changeVisible();
        txtAr.focus();
        txtAr.focus();
        txtAr.printText();

        System.out.println("\n");

        txtFld.printName();
        txtFld.changeVisible();
        txtFld.focus();
        txtFld.focus();
        txtFld.printText();

        System.out.println("\n");

        pan.printName();
        pan.addElement(new CheckboxGroup("CHECKBOXGROUP1"));
        pan.printAllElements();

        System.out.println("\n");

        wind.printName();
        wind.focus();
        wind.addElement(new Button("BUTTON1"));
        wind.printAllElements();

        System.out.println("\n");

        appl.printName();

        System.out.println("\n");

        dial.printName();
        dial.setMessage();
        dial.getCoordinate();
        dial.changeVisible();
        dial.focus();
        dial.drag(5, 6);

        System.out.println("\n");

        frame.printName();
        frame.changeVisible();
        frame.placeFavicon();
        frame.focus();

        System.out.println("\n");

        filDial.printName();
        filDial.changeVisible();
        filDial.focus();
        filDial.openFile("NEW FILE");
    }
}
