package de.akull.ds.tree;

import java.util.List;

@SuppressWarnings("WeakerAccess")
public class Tree {

    static void traverseInOrder(Node n, List<Object> acc) {
        if (n != null) {
            traverseInOrder(n.left, acc);
            acc.add(n.data);
            traverseInOrder(n.right, acc);
        }
    }

    static void traversePreOrder(Node n, List<Object> acc) {
        if (n != null) {
            acc.add(n.data);
            traversePreOrder(n.left, acc);
            traversePreOrder(n.right, acc);
        }
    }

    static void traversePostOrder(Node n, List<Object> acc) {
        if (n != null) {
            traversePostOrder(n.left, acc);
            traversePostOrder(n.right, acc);
            acc.add(n.data);
        }
    }
}
