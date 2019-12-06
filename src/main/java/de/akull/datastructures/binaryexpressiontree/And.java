package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;


class And extends Node {

    Node left;
    Node right;

    And(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    boolean eval(HashMap<String, String> p) {
        return left.eval(p) && right.eval(p);
    }
}
