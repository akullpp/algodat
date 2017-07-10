package de.akull.ds.tree;

public class Node<T> {

    public T data;
    public Node left;
    public Node right;

    public Node(T data) {
        this.data = data;
    }
}
