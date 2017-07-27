package de.akull.ds.stack;

import java.util.EmptyStackException;

@SuppressWarnings("WeakerAccess")
public class Stack {

    public Node head;

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
