package de.akull.ds.trie;

import lombok.Data;

import java.util.HashMap;

@Data
public class Node {
    private HashMap<Character, Node> children = new HashMap<>();
    private boolean isWord;
}
