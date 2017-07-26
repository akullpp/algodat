package de.akull.ds.tree;

import java.util.List;

public class Tree {

    static void traverseInOrder(Node n, List<Object> acc) {
        if (n != null) {
            traverseInOrder(n.getLeft(), acc);
            acc.add(n.getData());
            traverseInOrder(n.getRight(), acc);
        }
    }

    static void traversePreOrder(Node n, List<Object> acc) {
        if (n != null) {
            acc.add(n.getData());
            traversePreOrder(n.getLeft(), acc);
            traversePreOrder(n.getRight(), acc);
        }
    }

    static void traversePostOrder(Node n, List<Object> acc) {
        if (n != null) {
            traversePostOrder(n.getLeft(), acc);
            traversePostOrder(n.getRight(), acc);
            acc.add(n.getData());
        }
    }
}
