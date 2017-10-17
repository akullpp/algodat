package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;

@SuppressWarnings("WeakerAccess")
public class Not implements Node {

    public Node node;

    public Not(Node node) {
        this.node = node;
    }

    public boolean eval(HashMap<String, String> p) {
        return !node.eval(p);
    }
}
