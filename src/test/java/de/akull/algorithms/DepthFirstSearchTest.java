package de.akull.algorithms;

import static org.assertj.core.api.Assertions.assertThat;

import de.akull.algorithms.DepthFirstSearch.Node;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class DepthFirstSearchTest {

    @Test
    void Should_Find_Path() {
        Graph graph = Graph.build();

        boolean result = DepthFirstSearch.hasPath(graph.get(0), graph.get(2));

        assertThat(result).isTrue();
    }

    @Test
    void Should_Return_False_If_No_Path() {
        Graph graph = Graph.build();

        boolean result = DepthFirstSearch.hasPath(graph.get(3), graph.get(0));

        assertThat(result).isFalse();
    }

    static class Graph {

        public HashMap<Integer, Node> nodes = new HashMap<>();

        public static Graph build() {
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
}
