package elements;

public class Container extends Component {

    public Container(int width, int height, String name) {
        super(width, height, name);
    }

   public void hasobjects(int count){
        System.out.println("Container has: "+count+" objects");
   }

}
