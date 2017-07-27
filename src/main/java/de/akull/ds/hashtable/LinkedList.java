package de.akull.ds.hashtable;


import lombok.Getter;

class LinkedList<K, V> {

    @Getter
    private Node<K, V> head;

    private Node<K, V> tail;

    // O(1)
    private void prepend(Node<K, V> n) {
        n.setNext(head);
        head = n;

        if (tail == null) {
            tail = head;
        }
    }

    // O(1)
    void append(Node<K, V> n) {
        if (head == null) {
            prepend(n);
        } else {
            tail.setNext(n);
            tail = n;
        }
    }
}
