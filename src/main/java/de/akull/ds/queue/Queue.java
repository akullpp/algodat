package de.akull.ds.queue;

import java.util.EmptyStackException;

public class Queue {

    private Node head;
    private Node tail;

    public void add(Node n) {
        if (tail != null) {
            tail.next = n;
        }
        tail = n;
        if (head == null) {
            head = n;
        }
    }

    public Node remove() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node n = head;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        return n;
    }

    public Node peek() {
        return head;
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
