package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;


class Equal extends Node {

    String key;
    String value;

    Equal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    boolean eval(HashMap<String, String> p) {
        String value = p.get(key);

        if (value == null) {
            return false;
        }
        return this.value.equals(value);
    }
}

