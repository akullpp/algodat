package de.akull.ds.stack;

import java.util.EmptyStackException;

public class Stack {

    private Node head;

    public void push(Node n) {
        n.next = head;
        head = n;
    }

    public Node pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        Node n = head;
        head = head.next;
        return n;
    }

    public Node peek() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
