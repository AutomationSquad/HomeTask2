package elements;

public class Component {

    private String componentName;
    private int size;

    Component(String newComponentName) {
        this.setComponentName(newComponentName);
        System.out.println("ComponentName:" + newComponentName);
    }
    Component(String newComponentName, int newSize) {
        this.setComponentName(newComponentName);
        this.size=newSize;
        System.out.println("ComponentName:" + newComponentName);
        System.out.println("Size:" + newSize);
    }

    public void hoverOnComponent (){
        System.out.println("Component is hovered");
    }
    public String getComponentName(){
        return this.componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }
}
