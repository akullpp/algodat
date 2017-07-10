package de.akull.ds.hashtable;

public class LinkedList {

    public Node head;

    public Node tail;

    public int size;

    // O(1)
    public void prepend(Node n) {
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // O(1)
    public void append(Node n) {
        if (head == null) {
            prepend(n);
        } else {
            tail.next = n;
            tail = n;
            size++;
        }
    }
}
