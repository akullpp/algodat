package de.akull.datastructures.linkedlist;

class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    /**
     * Adds new node at the end of the list.
     */
    void append(Node<T> n) {
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        size++;
    }

    /**
     * Adds new node at the start of the list.
     */
    void prepend(Node<T> n) {
        n.next = head;
        head = n;

        if (tail == null) {
            tail = n;
        }
        size++;
    }

    /**
     * Adds a new node after a specific one.
     */
    void insertAfter(Node<T> newNode, Node<T> node) {
        if (node.equals(tail)) {
            tail = newNode;
        }
        newNode.next = node.next;
        node.next = newNode;
        size++;
    }

    /**
     * Adds a new node before a specific one.
     */
    void insertBefore(Node<T> newNode, Node<T> node) {
        if (head.equals(node)) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> n = head;

            while (n.next != null) {
                if (node.equals(n.next)) {
                    newNode.next = n.next;
                    n.next = newNode;
                    break;
                }
                n = n.next;
            }
        }
        size++;
    }

    /**
     * Deletes node after a specific one.
     */
    void removeAfter(Node<T> n) {
        if (n.next != null) {
            if (n.next.equals(tail)) {
                tail = n;
            }
            n.next = n.next.next;
            size--;
        }
    }

    /**
     * Deletes node before a specific one.
     */
    void removeBefore(Node<T> n) {}

    /**
     * Deletes the current head.
     */
    void removeHead() {
        if (head != null) {
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }
        }
    }

    /**
     * Deletes the current tail.
     */
    void removeTail() {}

    /**
     * Deletes a specific node.
     */
    void remove(Node<T> n) {}

    /**
     * Returns a node at a specific position.
     */
    Node<T> get(int index) {
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
