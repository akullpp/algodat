package de.akull.datastructures.stack;

import java.util.EmptyStackException;


class Stack {

    Node head;

    void push(Node n) {
        n.next = head;
        head = n;
    }

    Node pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node n = head;
        head = head.next;
        return n;
    }

    Node peek() {
        return head;
    }

    boolean isEmpty() {
        return head == null;
    }
}
