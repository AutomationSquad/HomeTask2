package elements;

public class Dialog extends Window {
        public String nameDialog;

        public Dialog (String name, int width, int height){
            super(name, width, height);
            this.name = nameDialog;
        }

        @Override
        public void selectComponent () {
            System.out.println(nameDialog + "selected");
        }

        @Override
        public void addWindow (){
            System.out.print("The" + nameDialog + "is added");
        }
}
