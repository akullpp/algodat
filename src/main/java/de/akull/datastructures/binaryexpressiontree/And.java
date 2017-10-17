package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;

@SuppressWarnings("WeakerAccess")
public class And implements Node {

    public Node left;
    public Node right;

    public And(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public boolean eval(HashMap<String, String> p) {
        return left.eval(p) && right.eval(p);
    }
}
