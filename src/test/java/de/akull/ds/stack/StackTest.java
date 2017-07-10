package de.akull.ds.stack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.assertj.core.api.Assertions.*;

public class StackTest {

    private Stack stack;
    private Node n1 = new Node<>(1);
    private Node n2 = new Node<>(2);
    private Node n3 = new Node<>(3);

    @Before
    public void init() {
        stack = new Stack();
        stack.push(n1);
        stack.push(n2);
        stack.push(n3);
    }

    @Test
    public void pop() throws Exception {
        Node n = stack.pop();
        assertThat(n).isEqualTo(n3);

        Node nn = stack.pop();
        assertThat(nn).isEqualTo(n2);

        Node nnn = stack.pop();
        assertThat(nnn).isEqualTo(n1);

        assertThatThrownBy(() -> stack.pop()).isInstanceOf(EmptyStackException.class);
    }

    @Test
    public void peek() throws Exception {
        assertThat(stack.peek()).isEqualTo(n3);
    }

    @Test
    public void isEmpty() throws Exception {
        assertThat(stack.isEmpty()).isFalse();

        stack.pop();
        stack.pop();
        stack.pop();

        assertThat(stack.isEmpty()).isTrue();
    }
}
