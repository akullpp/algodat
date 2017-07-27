package de.akull.ds.linkedlist;

@SuppressWarnings("WeakerAccess")
public class Node<T> {

    public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
