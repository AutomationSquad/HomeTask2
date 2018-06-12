package elements;

public class Component extends Object {

       public String name;

        Component() {

            this.name = "not selected";
        }


        public void selected () {

            System.out.println(name + "is selected");
        }
}
