package HomeTask.Classes;

import HomeTask.Interfaces.Ivisible;

public abstract class MyObject implements Ivisible {
    public String name;
    public boolean visibl = false;

    public void printName() {

        {
            System.out.println("The name of this " + getClass().getSimpleName().toLowerCase() + " is " + name);
        }
    }

    @Override
    public void changeVisible() {
        visibl = !visibl;
        if (visibl)
            System.out.println(name + " is shown");
        else System.out.println(name + " is hide");
    }
}
