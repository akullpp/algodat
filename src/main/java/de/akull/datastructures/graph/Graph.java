package de.akull.datastructures.graph;

import java.util.HashMap;

public class Graph {

    public HashMap<Integer, Node> nodes = new HashMap<>();

    public Node get(int i) {
        return nodes.get(i);
    }

    public void addNode(Node n) {
        nodes.put(n.id, n);
    }

    public void addEdge(Node source, Node destination) {
        source.adjacent.add(destination);
    }
}
