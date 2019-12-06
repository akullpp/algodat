package de.akull.datastructures.dynamicarray;

import java.util.Arrays;


class DynamicArray<T> {

    static final int INCREASE_FACTOR = 2;

    int capacity = 3;
    int size = 0;
    Object[] array = new Object[capacity];

    void add(T t) {
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity *= INCREASE_FACTOR);
        }
        array[size++] = t;
    }
}
