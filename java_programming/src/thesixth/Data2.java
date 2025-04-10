package thesixth;

public class Data2<T extends Number> {
    private T t;

    public Data2(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
