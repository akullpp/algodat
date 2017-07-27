package de.akull.ds.linkedlist;

@SuppressWarnings("WeakerAccess")
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

    // O(1)
    public void insertAfter(Node node, Node newNode) {
        if (node.equals(tail)) {
            tail = newNode;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    // O(1)
    public void removeAfter(Node n) {
        if (n.next != null) {
            if (n.next.equals(tail)) {
                tail = n;
            }
            n.next = n.next.next;
            size--;
        }
    }

    // O(1)
    void removeHead() {
        if (head != null) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
        }
    }

    // O(n)
    public Node get(int index) {
        if (index > size - 1) {
            return null;
        }
        Node n = head;

        while (n.next != null && index > 0) {
            n = n.next;
            index--;
        }
        return n;
    }
}
