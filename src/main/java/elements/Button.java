package elements;

public class Button extends Component {

            private String titleButton;
            private String color;
            private Boolean enable;


            public Button (String s, String c, Boolean b) {
                this.setTitle(s);
                this.setColor(c);
                this.setEnable(b);
            }


      public void click() {

          System.out.println("Click on the" + getTitle());
      }

    public String getTitle() {
        return titleButton;
    }

    public void setTitle(String title) {
        this.titleButton = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
