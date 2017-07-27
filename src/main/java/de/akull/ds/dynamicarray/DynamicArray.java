package de.akull.ds.dynamicarray;

import lombok.Getter;

import java.util.Arrays;

@Getter
class DynamicArray<T> {

    private static final int INCREASE_FACTOR = 2;

    private int capacity = 7;
    private int size = 0;
    private Object[] array = new Object[capacity];

    void add(T t) {
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity *= INCREASE_FACTOR);
        }
        array[size++] = t;
    }
}
