package elements;

public abstract class Window extends Container implements IVisible, IDrageble, IClosable{

    public void openWindow (Window window) {
        System.out.println("Window is opened");
    }

    @Override
    public void isClosed() {
    }

    public abstract void close();

    public abstract void isDisplayed();
}
