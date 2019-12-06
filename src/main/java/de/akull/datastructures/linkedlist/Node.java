package de.akull.datastructures.linkedlist;

/**
 * A node is a sequential link in a list of nodes and holds some data.
 */
class Node<T> {

    Node<T> next;
    T data;

    Node(T data) {
        this.data = data;
    }
}
