package de.akull.datastructures.trie;


class Trie {

    Node root = new Node();

    void insert(String s) {
        Node current = root;
        for (char c : s.toCharArray()) {
            current.children.putIfAbsent(c, new Node());
            current = current.children.get(c);
        }
        current.isWord = true;
    }

    boolean isWord(String s) {
        Node current = root;

        for (char c : s.toCharArray()) {
            current = current.children.get(c);

            if (current == null) {
                return false;
            }
        }
        return current.isWord;
    }
}

