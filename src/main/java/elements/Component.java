package elements;

public abstract class Component{
    public String name;
    public String position;

    public Component() {
        name = "";
        position = "";
    }

    public void highlightComponent(){
        System.out.println(name + " is highlighted.");
    }

}
