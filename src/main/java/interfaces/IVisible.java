package interfaces;

public interface IVisible {

    void visible();

    default void visible(int secondsNumber) {
        System.out.println("Visible by default for " + secondsNumber + " seconds.");
    }
}
