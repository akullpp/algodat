package de.akull.datastructures.trie;

import java.util.HashMap;


class Node {

    HashMap<Character, Node> children = new HashMap<>();
    boolean isWord;
}
