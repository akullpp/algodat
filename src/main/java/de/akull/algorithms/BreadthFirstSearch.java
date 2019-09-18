package de.akull.algorithms;

import de.akull.datastructures.graph.Node;
import java.util.HashSet;
import java.util.LinkedList;

@SuppressWarnings("WeakerAccess")
public class BreadthFirstSearch {

    public static boolean hasPath(Node source, Node destination) {
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(source);

        while (!nextToVisit.isEmpty()) {
            Node n = nextToVisit.remove();

            if (n == destination) {
                return true;
            }
            if (visited.contains(n.id)) {
                continue;
            }
            visited.add(n.id);
            nextToVisit.addAll(n.adjacent);
        }
        return false;
    }
}
