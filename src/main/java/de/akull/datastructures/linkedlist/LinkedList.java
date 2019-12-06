package de.akull.datastructures.linkedlist;

public class LinkedList<T> {

    public Node<T> head;
    public Node<T> tail;
    public int size;

    public void prepend(Node<T> n) {
        n.next = head;
        head = n;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void append(Node<T> n) {
        if (head == null) {
            prepend(n);
        } else {
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public void insertAfter(Node<T> node, Node<T> newNode) {
        if (node.equals(tail)) {
            tail = newNode;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    public void removeAfter(Node<T> n) {
        if (n.next != null) {
            if (n.next.equals(tail)) {
                tail = n;
            }
            n.next = n.next.next;
            size--;
        }
    }

    void removeHead() {
        if (head != null) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
        }
    }

    public Node<T> get(int index) {
        if (index > size - 1) {
            return null;
        }
        Node<T> n = head;

        while (n.next != null && index > 0) {
            n = n.next;
            index--;
        }
        return n;
    }
}
