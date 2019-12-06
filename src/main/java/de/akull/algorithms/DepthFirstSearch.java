package de.akull.algorithms;

import java.util.HashSet;
import java.util.LinkedList;


class DepthFirstSearch {

    static boolean hasPath(Node source, Node destination) {
        HashSet<Integer> visited = new HashSet<>();
        return hasPath(source, destination, visited);
    }

    static boolean hasPath(Node s, Node d, HashSet<Integer> visited) {
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

    static class Node {

        int id;
        LinkedList<Node> adjacent = new LinkedList<>();

        Node(int id) {
            this.id = id;
        }
    }
}
