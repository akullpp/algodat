package de.akull.ctci;

import de.akull.datastructures.linkedlist.LinkedList;
import de.akull.datastructures.linkedlist.Node;

public class KthToLast_2_2 {

    public static Node findKthToLast(LinkedList linkedList, int k) {
        int times = linkedList.size - k;

        Node n = linkedList.head;
        for (int i = 0; i <= times; i++) {
            n = n.next;
        }
        return n;
    }

    public static Node realKthToLast(LinkedList linkedList, int k) {
        Index i = new Index();
        return realKthToLast(linkedList.head, k, i);
    }

    public static Node realKthToLast(Node n, int k, Index i) {
        if (n == null) {
            return null;
        }
        Node nn = realKthToLast(n.next, k, i);
        i.counter += 1;
        if (i.counter == k) {
            return n;
        }
        return nn;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(new Node<>(1));
        linkedList.append(new Node<>(2));
        linkedList.append(new Node<>(3));
        linkedList.append(new Node<>(4));
        linkedList.append(new Node<>(5));

        realKthToLast(linkedList, 3);
    }

    public static class Index {
        public int counter;
    }
}
