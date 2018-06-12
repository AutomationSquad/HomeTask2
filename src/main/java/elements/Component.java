package elements;

public class Component {

    String name;
    int width;
    int height;


    public Component() {
        name = "";

    }

    public Component(int width, int height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
        System.out.println(name+" size: width - " + width + ", height - " + height);
    }


    public void focus(){
        System.out.println(name + " in focus");
    }

    public static void main(String[] args) {
      Button button1 = new Button("Button1");
      button1.focus();
      button1.click("button2");
      button1.click("button2",5);

      Label label1 = new Label();
      label1.name = "Label1";
      label1.focus();

      Checkbox checkbox1 = new Checkbox(25,100, "CheckBox1");

      TextComponent textComponent1 = new TextComponent("TextComponent1");
      textComponent1.focus();

      Container container1 = new Container(50,50, "Container1");
      container1.hasobjects(5);

      Panel panel1 = new Panel(100,100,"Panel1");
      panel1.hasobjects(2);
      panel1.transparency(50);

      Applet applet1 = new Applet(75, 80, "Applet1");
      applet1.transparency(75);

      Window window1 = new Window(150,150,"Window1");
      window1.close(Boolean.FALSE);
      window1.open(Boolean.TRUE);

      Frame frame1 = new Frame(200,200,"Frame1");
      frame1.widthBorder(2);

      Dialog dialog1 = new Dialog(120,170,"Dialog1");
      dialog1.close(Boolean.TRUE);
      dialog1.open(Boolean.FALSE);

      TextArea textArea1 = new TextArea("TextArea1");
      textArea1.textIsAligned();

      TextField textField1 = new TextField("TextField1");
      textField1.textIsAligned();

    }


}
