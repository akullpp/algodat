package de.akull.ds;

public class Stack<T> {

    public int capacity;
    public T[] list;

    public Stack(int length) {
        capacity = length;
        list = (T[]) new Object[length];
    };
}
