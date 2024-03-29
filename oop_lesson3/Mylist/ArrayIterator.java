package oop_lesson3.Mylist;

import java.util.Iterator;

public class ArrayIterator <T> implements Iterator<T> {
    int index;
    T[]values;

    public ArrayIterator(T[] values) {
        this.values = values;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}