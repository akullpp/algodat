package de.akull.datastructures.linkedlist;

@SuppressWarnings("WeakerAccess")
public class Node<T> {

    public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
