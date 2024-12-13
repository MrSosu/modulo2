package esempi.generics;

public class Coppia<T> {

    private T x;
    private T y;

    public Coppia(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}
