package de.akull.datastructures.hashtable;


class LinkedList<K, V> {

    Node<K, V> head;

    Node<K, V> tail;

    // O(1)
    void prepend(Node<K, V> n) {
        n.next = head;
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
            tail.next = n;
            tail = n;
        }
    }
}
