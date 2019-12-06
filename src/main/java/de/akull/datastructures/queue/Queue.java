package de.akull.datastructures.queue;

import java.util.EmptyStackException;


class Queue {

    Node head;
    Node tail;

    void add(Node n) {
        if (tail != null) {
            tail.next = n;
        }
        tail = n;
        if (head == null) {
            head = n;
        }
    }

    Node remove() {
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

    Node peek() {
        return head;
    }

    boolean isEmpty() {
        return tail == null;
    }
}
