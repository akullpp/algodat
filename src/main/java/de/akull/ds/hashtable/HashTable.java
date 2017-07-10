package de.akull.ds.hashtable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class HashTable<K, V> {

    public int capacity = 16;
    public LinkedList[] buckets = new LinkedList[capacity];

    public int hash(String key) {
        int hash = 0;
        // O(N)
        char[] chars = key.toCharArray();

        // O(N)
        for (char c : chars) {
            hash = 31 * hash + c;
        }
        return hash;
    }

    // O(1)
    public void put(K key, V value) {
        if (Math.floor(capacity * 0.75) >= buckets.length + 1) {
            LinkedList[] newBuckets = new LinkedList[capacity * 2];
            capacity *= 2;

            for (LinkedList bucket : buckets) {
                
            }
        }
        int index = Math.abs(hash(key.toString()) % buckets.length);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList();
        }
        buckets[index].append(new Node<>(key, value));
    }

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("Siblings", 1);
        hashTable.put("Teheran", 2);
    }
}
