package oop_lesson3.Mylist;

public interface GBList<T> extends Iterable<T> {
    boolean add(T t);
    void remove(int index);
    T get(int index);
    int size();
    void update(int index,T t);
    GBList<T> join(T t);
}