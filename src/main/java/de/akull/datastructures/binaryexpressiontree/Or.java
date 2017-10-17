package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;

@SuppressWarnings("WeakerAccess")
public class Or implements Node {

    public Node left;
    public Node right;

    public Or(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public boolean eval(HashMap<String, String> p) {
        return left.eval(p) || right.eval(p);
    }
}
