package elements;

public class Checkbox extends Component {

    private boolean b = true;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }


    public Checkbox (Boolean b1) {
        this.b = false;
    }

     void displayCheckbox() {

         System.out.println("Checkbox has " + b);
     }

}

