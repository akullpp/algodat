package de.akull.ds.dynamicarray;

import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class DynamicArray<T> {

    public static final int INCREASE_FACTOR = 2;

    public int capacity = 3;
    public int size = 0;
    public Object[] array = new Object[capacity];

    public void add(T t) {
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity *= INCREASE_FACTOR);
        }
        array[size++] = t;
    }
}
