package de.akull.datastructures.hashtable;


class Node<K, V> {

    Node<K, V> next;

    K key;

    V value;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
