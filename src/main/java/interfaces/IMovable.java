
package interfaces;

public interface IMovable {

    void move(int distance);

    default void move() {
        this.move(1000);
    }
}