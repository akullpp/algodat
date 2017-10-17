package de.akull.algorithms;

import de.akull.datastructures.graph.Graph;
import de.akull.datastructures.graph.Node;

public class Datastructures {

    public static Graph graph() {
        Graph graph = new Graph();
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        graph.addNode(n0);
        graph.addNode(n1);
        graph.addNode(n2);
        graph.addNode(n3);

        graph.addEdge(n0, n1);
        graph.addEdge(n0, n3);
        graph.addEdge(n1, n2);
        graph.addEdge(n2, n1);
        graph.addEdge(n2, n0);

        return graph;
    }
}
