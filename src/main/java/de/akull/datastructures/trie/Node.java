package de.akull.datastructures.trie;

import java.util.HashMap;

@SuppressWarnings("WeakerAccess")
public class Node {

    public HashMap<Character, Node> children = new HashMap<>();
    public boolean isWord;
}
