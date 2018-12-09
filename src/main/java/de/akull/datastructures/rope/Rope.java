package de.akull.datastructures.rope;

public class Rope {

    public static Node concat(Node n1, Node n2) {
        return new Node(n1, n2);
    }
}
