package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;


class Not extends Node {

    Node node;

    Not(Node node) {
        this.node = node;
    }

    boolean eval(HashMap<String, String> p) {
        return !node.eval(p);
    }
}
