package elements;

public class Button extends Component implements IClickable, IVisible {
    public String name;

    public Button(String name){
        this.name=name;
    }

    @Override
    public void focus(){
        System.out.println(name + " in focus");
    }

    public void click(String name){
        System.out.println(name + " clicked");
    }

    public void click(String name,int width){
        System.out.println(name + " clicked "+ "width: "+width);
    }
    @Override
    public void isClick(){
        System.out.println("Button is clickable");
    }
    @Override
    public void isDisplayed(){
        System.out.println("Button is visible");
    }
}
