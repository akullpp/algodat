package de.akull.datastructures.rope;

/*
 * A leaf is a node that has no left and no right node.
 * A leaf's weight is equal to the fragment's length.
 * An internal node is a node with left and right node and no fragment.
 * An internal node's weight is equal to the weights of its left subtree.
 */
public class Node {

    public Node left;

    public Node right;

    public int weight;

    public char[] chars;

    // Root node.
    public Node() {
    }

    // Internal node.
    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
        computeWeight(left);
    }

    // Leaf node.
    public Node(String fragment) {
        this.chars = fragment.toCharArray();
        this.weight = fragment.length();
    }

    /*
     * Returns fragment at i searching from this node.
     */
    public char index(int i) {
        return index(this, i);
    }

    // TODO: Implement
    public void split() {}

    // TODO: Implement
    public void insert() {}

    // TODO: Implement
    public void delete() {}

    // TODO: Implement
    public void report() {}

    private char index(Node node, int i) {
        if (node.weight <= i) {
            return index(node.right, i - node.weight);
        }
        if (node.left != null) {
            return index(node.left, i);
        }
        return node.chars[i];
    }

    private void computeWeight(Node node) {
        if (node != null) {
            computeWeight(node.left);
            if (isLeaf(node)) {
                this.weight += node.weight;
            }
            computeWeight(node.right);
        }
    }

    private boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }
}
