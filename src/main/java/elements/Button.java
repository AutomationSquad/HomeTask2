package elements;

public class Button extends Component {
    public String form;
    public boolean clickable;


    public Button(String name, String form, boolean clickable) {
        super(name);
        this.form = form;
        this.clickable = clickable;
    }

    public void printName() {
        System.out.println("this is: "+ name + "with form: "+ form + "clickable:" + clickable);

    }
}
