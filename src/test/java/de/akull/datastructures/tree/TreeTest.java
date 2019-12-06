package de.akull.datastructures.tree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {

    //       0
    //   1       2
    // 3   4
    private Node n0;

    @BeforeEach
    void setup() {
        // Leaf nodes
        Node n2 = new Node();
        n2.data = "2";
        Node n3 = new Node();
        n3.data = "3";
        Node n4 = new Node();
        n4.data = "4";

        Node n1 = new Node();
        n1.data = "1";
        n1.left = n3;
        n1.right = n4;

        n0 = new Node();
        n0.data = "0";
        n0.left = n1;
        n0.right = n2;
    }

    @Test
    void Should_Traverse_In_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traverseInOrder(n0, acc);

        assertThat(acc).containsSequence("3", "1", "4", "0", "2");
    }

    @Test
    void Should_Traverse_Pre_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traversePreOrder(n0, acc);

        assertThat(acc).containsSequence("0", "1", "3", "4", "2");
    }

    @Test
    void Should_Traverse_Post_Order() {
        List<Object> acc = new ArrayList<>();

        Tree.traversePostOrder(n0, acc);

        assertThat(acc).containsSequence("3", "4", "1", "2", "0");
    }
}
