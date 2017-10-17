package de.akull.datastructures.graph;

import java.util.LinkedList;

@SuppressWarnings("WeakerAccess")
public class Node {

    public int id;
    public LinkedList<Node> adjacent = new LinkedList<>();

    public Node(int id) {
        this.id = id;
    }
}
