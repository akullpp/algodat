package de.akull.datastructures.stack;

@SuppressWarnings("WeakerAccess")
public class Node<T> {

    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
    }
}
