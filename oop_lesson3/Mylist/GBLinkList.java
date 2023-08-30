package oop_lesson3.Mylist;

public interface GBLinkList<T> extends Iterable <T>{
    boolean addFirst(T t);
    boolean addLast(T t);
    int size();
    T get(int index);
    
}
