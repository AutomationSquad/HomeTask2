package elements;


public class TestApplication {

    public static void main(String[] args) {


        Window w = new Window();
        System.out.println(w);

        Applet a = new Applet();
        System.out.println(a);

        Button b = new Button("a", "b", true);
        System.out.println(b);

        Checkbox ch = new Checkbox(true);
        System.out.println(ch);


        CheckboxGroup cg = new CheckboxGroup();
        System.out.println(cg);

        Component c = new Component();
        System.out.println(c);

        Container con = new Container();
        System.out.println(con);

        Dialog d = new Dialog();
        System.out.println(d);

        FileDialog fd = new FileDialog();
        System.out.println(fd);

        Label l = new Label();
        System.out.println(l);

        Panel p = new Panel();
        System.out.println(p);

        TextArea ta = new TextArea();
        System.out.println(ta);

        TextComponent tc = new TextComponent();
        System.out.println(tc);

        TextField tf = new TextField();
        System.out.println(tf);


    }
}
