package de.akull.ds.hashtable;

@SuppressWarnings("WeakerAccess")
public class Node<K, V> {

    public Node<K, V> next;

    public K key;

    public V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
