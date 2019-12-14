package de.akull.datastructures.linkedlist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Linked List")
class LinkedListTest {

    LinkedList<String> linkedList;
    Node<String> a = new Node<>("A");
    Node<String> b = new Node<>("B");
    Node<String> c = new Node<>("C");

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>();
    }

    @Nested
    class append {

        @Test
        @DisplayName("should add new nodes at the end of the list")
        void Should_Add_Nodes() {
            Node<String> d = new Node<>("D");
            Node<String> e = new Node<>("E");
            Node<String> f = new Node<>("F");

            linkedList.append(a);
            linkedList.append(b);
            linkedList.append(c);
            linkedList.append(d);
            linkedList.append(e);
            linkedList.append(f);

            assertThat(linkedList.size).isEqualTo(6);
            assertThat(linkedList.head).isEqualTo(a);
            assertThat(linkedList.tail).isEqualTo(f);

            assertThat(a.next).isEqualTo(b);
            assertThat(b.next).isEqualTo(c);
            assertThat(c.next).isEqualTo(d);
            assertThat(d.next).isEqualTo(e);
            assertThat(e.next).isEqualTo(f);
            assertThat(f.next).isNull();
        }
    }

    @Nested
    class prepend {

        @Test
        @DisplayName("should add new nodes at the start of the list")
        void Should_Add_Nodes() {
            linkedList.prepend(a);
            linkedList.prepend(b);
            linkedList.prepend(c);

            assertThat(linkedList.size).isEqualTo(3);
            assertThat(linkedList.head).isEqualTo(c);
            assertThat(linkedList.tail).isEqualTo(a);

            assertThat(c.next).isEqualTo(b);
            assertThat(b.next).isEqualTo(a);
            assertThat(a.next).isNull();
        }
    }

    @Nested
    class get {

        @Test
        @DisplayName("should retrieve node from it's position")
        void Should_Get_Node() {
            linkedList.append(a);
            linkedList.append(b);
            linkedList.append(c);

            assertThat(linkedList.get(0)).isEqualTo(a);
            assertThat(linkedList.get(1)).isEqualTo(b);
            assertThat(linkedList.get(2)).isEqualTo(c);
        }
    }

    @Nested
    class insertAfter {

        @Test
        @DisplayName("should insert nodes after")
        void Should_Insert_Nodes_After() {
            linkedList.append(a);
            linkedList.insertAfter(b, a);
            linkedList.insertAfter(c, b);

            assertThat(linkedList.size).isEqualTo(3);
            assertThat(linkedList.head).isEqualTo(a);
            assertThat(linkedList.tail).isEqualTo(c);

            assertThat(a.next).isEqualTo(b);
            assertThat(b.next).isEqualTo(c);
            assertThat(c.next).isNull();
        }
    }

    @Nested
    class insertBefore {

        @Test
        @DisplayName("should insert nodes before")
        void Should_Insert_Nodes_Before() {
            linkedList.append(c);
            linkedList.insertBefore(b, c);
            linkedList.insertBefore(a, b);

            assertThat(linkedList.size).isEqualTo(3);
            assertThat(linkedList.head).isEqualTo(a);
            assertThat(linkedList.tail).isEqualTo(c);

            assertThat(a.next).isEqualTo(b);
            assertThat(b.next).isEqualTo(c);
            assertThat(c.next).isNull();
        }
    }

    @Nested
    class removeHead {

        @Test
        @DisplayName("should remove head")
        void Should_Remove_Head() {
            linkedList.append(a);
            linkedList.append(b);
            linkedList.append(c);

            linkedList.removeHead();
            linkedList.removeHead();
            linkedList.removeHead();

            assertThat(linkedList.size).isEqualTo(0);
            assertThat(linkedList.head).isNull();
            assertThat(linkedList.tail).isNull();
        }
    }

    @Nested
    class removeAfter {

        @Test
        @DisplayName("should remove nodes after")
        void Should_Remove_After() {
            linkedList.append(a);
            linkedList.append(b);
            linkedList.append(c);

            linkedList.removeAfter(a);
            linkedList.removeAfter(a);

            assertThat(linkedList.size).isEqualTo(1);
            assertThat(linkedList.head).isEqualTo(a);
            assertThat(linkedList.tail).isEqualTo(a);
            assertThat(a.next).isNull();
        }
    }
}
