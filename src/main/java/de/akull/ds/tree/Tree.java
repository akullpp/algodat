package de.akull.ds.tree;

public class Tree {

    public static void visit(Node n) {
        System.out.println(n.data);
    }

    public static void traverseInOrder(Node n) {
        if (n != null) {
            traverseInOrder(n.left);
            visit(n);
            traverseInOrder(n.right);
        }
    }

    public static void traversePreOrder(Node n) {
        if (n != null) {
            visit(n);
            traverseInOrder(n.left);
            traverseInOrder(n.right);
        }
    }

    public static void traversePostOrder(Node n) {
        if (n != null) {
            traverseInOrder(n.left);
            traverseInOrder(n.right);
            visit(n);
        }
    }

    public static void main(String[] args) {
        Node root = new Node<>(256);
        Node left = new Node<>(128);
        Node leftleft = new Node<>(64);
        root.left = left;
        left.left = leftleft;
        root.right = new Node<>(512);

        traversePostOrder(root);
    }
}
