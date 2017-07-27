package de.akull.ds.hashtable;

import lombok.Getter;

@SuppressWarnings("unchecked")
class HashTable<K, V> {

    private static final int INCREASE_FACTOR = 2;
    private static final int HASH_FACTOR = 31;
    private static final double LOAD_FACTOR = 0.75;

    @Getter
    private int capacity = 10;

    private int size = 0;
    private LinkedList<K, V>[] buckets = new LinkedList[capacity];

    private int hash(String key) {
        int hash = 0;
        // O(N)
        char[] chars = key.toCharArray();

        // O(N)
        for (char c : chars) {
            hash = HASH_FACTOR * hash + c;
        }
        return hash;
    }

    private void ensureCapacity() {
        if (size >= Math.floor(capacity * LOAD_FACTOR)) {
            size = 0;
            LinkedList<K, V>[] tmp = buckets;
            buckets = new LinkedList[capacity *= INCREASE_FACTOR];

            for (LinkedList<K, V> bucket : tmp) {
                if (bucket != null) {
                    Node<K, V> current = bucket.getHead();
                    while (current != null) {
                        put(current.getKey(), current.getValue());
                        current = current.getNext();
                    }
                }
            }
        }
    }

    private int computeIndex(K key) {
        return Math.abs(hash(key.toString()) % buckets.length);
    }

    // O(1)
    void put(K key, V value) {
        ensureCapacity();

        int index = computeIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        buckets[index].append(new Node<>(key, value));
        size++;
    }

    V get(K key) {
        int index = computeIndex(key);

        Node<K, V> current = buckets[index].getHead();
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
