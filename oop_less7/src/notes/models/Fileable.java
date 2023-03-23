package notes.models;

public interface Fileable<T> {
    T read();

    void save(T t);
}
