package de.akull.datastructures.hashtable;

@SuppressWarnings("WeakerAccess")
class LinkedList<K, V> {

    public Node<K, V> head;

    public Node<K, V> tail;

    // O(1)
    public void prepend(Node<K, V> n) {
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
    }

    // O(1)
    public void append(Node<K, V> n) {
        if (head == null) {
            prepend(n);
        } else {
            tail.next = n;
            tail = n;
        }
    }
}
