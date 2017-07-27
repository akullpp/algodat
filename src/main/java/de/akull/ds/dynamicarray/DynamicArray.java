package de.akull.ds.dynamicarray;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class DynamicArray<T> {
    private int capacity = 3;
    private int size = 0;
    private Object[] array = new Object[capacity];

    public void add(T t) {
        if (size == capacity) array = Arrays.copyOf(array, capacity *= 2);
        array[size++] = t;
    }
}
