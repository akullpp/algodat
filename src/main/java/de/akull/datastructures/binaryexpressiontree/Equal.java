package de.akull.datastructures.binaryexpressiontree;

import java.util.HashMap;

@SuppressWarnings("WeakerAccess")
public class Equal implements Node {

    public String key;
    public String value;

    public Equal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public boolean eval(HashMap<String, String> p) {
        String value = p.get(key);

        if (value == null) {
            return false;
        }
        return this.value.equals(value);
    }
}

