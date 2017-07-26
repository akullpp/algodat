package de.akull.ds.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TreeTest {

    //       A
    //   B       C
    // D       E   F
    private Node n0;

    @Before
    public void setup() {
        // Leaf nodes
        Node n2 = Node.builder().data("2").build();
        Node n3 = Node.builder().data("3").build();
        Node n4 = Node.builder().data("4").build();

        Node n1 = Node.builder()
                .data("1")
                .left(n3)
                .right(n4)
                .build();

        n0 = Node.builder()
                .data("0")
                .left(n1)
                .right(n2)
                .build();
    }

    @Test
    public void Should_Traverse_In_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traverseInOrder(n0, acc);

        assertThat(acc).containsSequence("3", "1", "4", "0", "2");
    }

    @Test
    public void Should_Traverse_Pre_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traversePreOrder(n0, acc);

        assertThat(acc).containsSequence("0", "1", "3", "4", "2");
    }

    @Test
    public void Should_Traverse_Post_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traversePostOrder(n0, acc);

        assertThat(acc).containsSequence("3", "4", "1", "2", "0");
    }
}
