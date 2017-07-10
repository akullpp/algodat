package de.akull.ds.dynamicarray;

public class DynamicArray<T> {

    public int capacity = 2;

    public int size = 0;

    public Object[] array = new Object[capacity];


    public void add(T t) {
        if (size == capacity) {
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = t;
    }
}
