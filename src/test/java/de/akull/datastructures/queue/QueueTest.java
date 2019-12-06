package de.akull.datastructures.queue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class QueueTest {

    private Queue queue;
    private Node n1 = new Node<>(1);
    private Node n2 = new Node<>(2);
    private Node n3 = new Node<>(3);

    @BeforeEach
    void init() {
        queue = new Queue();
        queue.add(n1);
        queue.add(n2);
        queue.add(n3);
    }

    @Test
    void Should_Remove_All_Nodes() {
        assertThat(queue.isEmpty()).isFalse();

        queue.remove();
        queue.remove();
        queue.remove();

        assertThat(queue.isEmpty()).isTrue();

    }

    @Test
    void Should_Throw_When_No_Nodes_And_Remove_Is_Called() {
        queue.remove();
        queue.remove();
        queue.remove();

        assertThatThrownBy(() -> queue.remove()).isInstanceOf(EmptyStackException.class);
    }

    @Test
    void Should_Retrieve_Head_Without_Removing() {
        assertThat(queue.peek()).isEqualTo(n1);
        assertThat(queue.head).isEqualTo(n1);
    }
}
