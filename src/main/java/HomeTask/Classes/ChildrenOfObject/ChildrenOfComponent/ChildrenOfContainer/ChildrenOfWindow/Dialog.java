package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.Window;
import HomeTask.Interfaces.*;

import java.util.Scanner;

public class Dialog extends Window implements Ifocusable, Ivisible, Idraggable {

    public  String message;

    public Dialog(String name) {
        super(name);
    }

    public void setMessage(){
        System.out.println("Enter the message:");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();
    }

    @Override
    public void changeVisible() {
        visibl = !visibl;
        if (visibl) {
            System.out.println("'" + name + "' is open");
            if (message != null) System.out.println("The message is " + message);
            else System.out.println("There isn't any messages!!!");
        }
        else System.out.println("'" + name + "' is closed");
    }
}
