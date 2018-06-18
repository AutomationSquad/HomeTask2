package elements;

public abstract class Container extends Component implements IVisible, IClosable{

    public abstract void setContent(String content);

    @Override
    public void getText() {

    }
}
