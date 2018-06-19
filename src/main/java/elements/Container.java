package elements;

public class Container extends Component{
    private String location;

    Container(String newComponentName, String location) {
        super(newComponentName);
        this.location=location;
    }

    @Override
    public void hoverOnComponent() {
        System.out.println("Container is hovered");
    }

    public void findLocation() {
        System.out.println("Container location is found");
    }

    public void findLocation(String location){
        System.out.println("Location:" + location);
    }
}
