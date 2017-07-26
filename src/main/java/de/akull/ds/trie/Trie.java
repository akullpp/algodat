package de.akull.ds.trie;

import lombok.Data;

@Data
public class Trie {
    private Node root = new Node();

    void insert(String s) {
        Node current = root;

        for (char c : s.toCharArray()) {
            current = current.getChildren().putIfAbsent(c, new Node());
            current = current.getChildren().get(c);
        }
        current.setWord(true);
    }

    boolean isWord(String s) {
        Node current = root;

        for (char c : s.toCharArray()) {
            current = current.getChildren().get(c);

            if (current == null) {
                return false;
            }
        }
        return current.isWord();
    }
}

