package de.akull.ds.hashtable;

import lombok.Data;

@Data
public class Node<K, V> {

    private Node<K, V> next;

    private K key;

    private V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
