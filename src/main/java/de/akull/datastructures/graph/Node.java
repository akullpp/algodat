package de.akull.datastructures.graph;

import java.util.LinkedList;


class Node {

    int id;
    LinkedList<Node> adjacent = new LinkedList<>();

    Node(int id) {
        this.id = id;
    }
}
