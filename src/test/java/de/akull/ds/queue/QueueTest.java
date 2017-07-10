package de.akull.ds.queue;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue;
    private Node n1 = new Node<>(1);
    private Node n2 = new Node<>(2);
    private Node n3 = new Node<>(3);

    @Before
    public void init() {
        queue = new Queue();
        queue.add(n1);
        queue.add(n2);
        queue.add(n3);
    }

    @Test
    public void remove() throws Exception {

        Node n = queue.remove();
        assertThat(n).isEqualTo(n1);

        Node nn = queue.remove();
        assertThat(nn).isEqualTo(n2);

        Node nnn = queue.remove();
        assertThat(nnn).isEqualTo(n3);

        assertThatThrownBy(() -> queue.remove()).isInstanceOf(EmptyStackException.class);
    }

    @Test
    public void peek() throws Exception {
        assertThat(queue.peek()).isEqualTo(n1);
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(queue.isEmpty()).isFalse();

        queue.remove();
        queue.remove();
        queue.remove();

        assertThat(queue.isEmpty()).isTrue();

    }

}
