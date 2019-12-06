package de.akull.datastructures.graph;

import java.util.HashMap;

class Graph {

    HashMap<Integer, Node> nodes = new HashMap<>();

    Node get(int i) {
        return nodes.get(i);
    }

    void addNode(Node n) {
        nodes.put(n.id, n);
    }

    void addEdge(Node source, Node destination) {
        source.adjacent.add(destination);
    }
}
