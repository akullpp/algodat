package de.akull.ds.ctci;

import de.akull.ds.linkedlist.LinkedList;
import de.akull.ds.linkedlist.Node;

import java.util.ArrayList;

public class RemoveDups_2_1 {

    public static void withBuffer(LinkedList linkedList) {
        ArrayList<Integer> buffer = new ArrayList<>();
        Node prev = linkedList.head;
        Node current = linkedList.head;
        while (current.next != null) {
            if (buffer.contains((Integer) current.data)) {
                linkedList.removeAfter(prev);
            } else {
                buffer.add((Integer) current.data);
            }
            prev = current;
            current = current.next;
        }
    }

    public static void withoutBuffer(LinkedList linkedList) {
        Node current = linkedList.head;
        while (current.next != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.data.equals(current.data)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(new Node<>(1));
        linkedList.append(new Node<>(2));
        linkedList.append(new Node<>(3));
        linkedList.append(new Node<>(3));
        linkedList.append(new Node<>(4));

        withoutBuffer(linkedList);
    }
}
