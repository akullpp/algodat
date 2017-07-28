package de.akull.datastructures.queue;

@SuppressWarnings("WeakerAccess")
public class Node<T> {

    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
    }
}
