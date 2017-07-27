package de.akull.ds.trie;

@SuppressWarnings("WeakerAccess")
public class Trie {
    public Node root = new Node();

    public void insert(String s) {
        Node current = root;
        for (char c : s.toCharArray()) {
            current.children.putIfAbsent(c, new Node());
            current = current.children.get(c);
        }
        current.isWord = true;
    }

    public boolean isWord(String s) {
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

