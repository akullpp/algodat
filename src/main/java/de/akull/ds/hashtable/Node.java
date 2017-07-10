package de.akull.ds.hashtable;

public class Node<K, V> {

    public Node next;

    public K key;

    public V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
