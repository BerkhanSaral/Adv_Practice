package generics.interfaces;

public interface Repository<T> {
    void add(T t);

    void get(T t);

    void update(T t);

    void remove(T t);


}
