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
        n1.data = "0";
        n1.left = n1;
        n1.right = n2;
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
