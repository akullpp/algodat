package de.akull.algorithms;

import de.akull.datastructures.graph.Node;

import java.util.HashSet;

@SuppressWarnings("WeakerAccess")
public class DepthFirstSearch {

    public static boolean hasPath(Node source, Node destination) {
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(source, destination, visited);
    }

    public static boolean hasPath(Node s, Node d, HashSet<Integer> visited) {
        if (visited.contains(s.id)) {
            return false;
        }
        if (s == d) {
            return true;
        }
        visited.add(s.id);

        for (Node n : s.adjacent) {
            if (hasPath(n, d, visited)) {
                return true;
            }
        }
        return false;
    }
}
