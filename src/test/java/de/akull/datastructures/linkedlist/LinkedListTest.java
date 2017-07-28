package de.akull.datastructures.linkedlist;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnit4.class)
@SuppressWarnings("Duplicates")
public class LinkedListTest {

    private LinkedList linkedList;
    private Node n1 = new Node<>("A");
    private Node n2 = new Node<>("B");
    private Node n3 = new Node<>("C");

    @Before
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void Should_Append() {
        Node n4 = new Node<>(1);
        Node n5 = new Node<>(2);
        Node n6 = new Node<>(3);

        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.append(n3);
        linkedList.append(n4);
        linkedList.append(n5);
        linkedList.append(n6);

        assertThat(linkedList.size).isEqualTo(6);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n6);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n3);
        assertThat(n3.next).isEqualTo(n4);
        assertThat(n4.next).isEqualTo(n5);
        assertThat(n5.next).isEqualTo(n6);
        assertThat(n6.next).isNull();
    }

    @Test
    public void Should_Prepend_Whithout_Existing_Nodes() {
        linkedList.prepend(n1);
        linkedList.append(n2);
        linkedList.append(n3);

        assertThat(linkedList.size).isEqualTo(3);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n3);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n3);
        assertThat(n3.next).isNull();
    }

    @Test
    public void Should_Prepend_With_Existing_Nodes() {
        linkedList.append(n2);
        linkedList.append(n3);
        linkedList.prepend(n1);

        assertThat(linkedList.size).isEqualTo(3);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n3);

        assertThat(n1.next).isEqualTo(n2);
        assertThat(n2.next).isEqualTo(n3);
        assertThat(n3.next).isNull();
    }

    @Test
    public void Should_Get_Node_From_Index() {
        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.append(n3);

        assertThat(linkedList.get(2)).isEqualTo(n3);
        assertThat(linkedList.get(1)).isEqualTo(n2);
        assertThat(linkedList.get(0)).isEqualTo(n1);
    }

    @Test
    public void Should_Insert_After_Head() {
        linkedList.append(n1);
        linkedList.append(n3);
        linkedList.insertAfter(n1, n2);

        assertThat(linkedList.size).isEqualTo(3);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n3);

        assertThat(linkedList.get(2)).isEqualTo(n3);
        assertThat(linkedList.get(1)).isEqualTo(n2);
        assertThat(linkedList.get(0)).isEqualTo(n1);
    }

    @Test
    public void Should_Insert_After_Tail() {
        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.insertAfter(n2, n3);

        assertThat(linkedList.size).isEqualTo(3);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n3);

        assertThat(linkedList.get(2)).isEqualTo(n3);
        assertThat(linkedList.get(1)).isEqualTo(n2);
        assertThat(linkedList.get(0)).isEqualTo(n1);
    }

    @Test
    public void Should_Insert_After_Inbetween() {
        Node n4 = new Node<>("D");

        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.append(n4);
        linkedList.insertAfter(n2, n3);

        assertThat(linkedList.size).isEqualTo(4);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n4);

        assertThat(linkedList.get(3)).isEqualTo(n4);
        assertThat(linkedList.get(2)).isEqualTo(n3);
        assertThat(linkedList.get(1)).isEqualTo(n2);
        assertThat(linkedList.get(0)).isEqualTo(n1);
    }

    @Test
    public void Should_Remove_Head() {
        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.append(n3);

        linkedList.removeHead();
        assertThat(linkedList.size).isEqualTo(2);
        assertThat(linkedList.head).isEqualTo(n2);
        assertThat(linkedList.tail).isEqualTo(n3);

        linkedList.removeHead();
        assertThat(linkedList.size).isEqualTo(1);
        assertThat(linkedList.head).isEqualTo(n3);
        assertThat(linkedList.tail).isEqualTo(n3);

        linkedList.removeHead();
        assertThat(linkedList.size).isEqualTo(0);
        assertThat(linkedList.head).isNull();
        assertThat(linkedList.tail).isNull();
    }

    @Test
    public void Should_Remove_After() {
        linkedList.append(n1);
        linkedList.append(n2);
        linkedList.append(n3);

        linkedList.removeAfter(n1);
        assertThat(linkedList.size).isEqualTo(2);
        assertThat(linkedList.get(1)).isEqualTo(n3);

        linkedList.removeAfter(n1);
        assertThat(linkedList.size).isEqualTo(1);
        assertThat(linkedList.head).isEqualTo(n1);
        assertThat(linkedList.tail).isEqualTo(n1);
    }
}
