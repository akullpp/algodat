package de.akull.datastructures.rope;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RopeTest {

    // https://upload.wikimedia.org/wikipedia/commons/8/8a/Vector_Rope_example.svg
    Node rope;

    @Before
    public void setup() {
        Node E = new Node("Hello_");
        Node F = new Node("my_");
        Node J = new Node("na");
        Node K = new Node("me_i");
        Node M = new Node("s");
        Node N = new Node("_Simon");

        Node G = new Node(J, K);
        Node H = new Node(M, N);

        Node C = new Node(E, F);
        Node D = new Node(G, H);

        Node B = new Node(C, D);

        rope = new Node(B, null);
    }

    @Test
    public void Should_Calculate_The_Correct_Total_Weight() {

        assertThat(rope.weight).isEqualTo(22);
    }

    @Test
    public void Should_Return_Character_At_Position() {

        char result = rope.index(10);

        assertThat(result).isEqualTo('a');
    }

    @Test
    public void Should_Be_Able_To_Concatenate_Two_Nodes() {
        Node n1 = new Node("Hello_");
        Node n2 = new Node("wo");
        Node n3 = new Node("rl");
        Node n4 = new Node("d!");

        Node n5 = new Node(n3, n4);
        Node n6 = new Node(n2, n5);

        Node result = Rope.concat(n1, n6);

        assertThat(result.weight).isEqualTo(6);
    }
}