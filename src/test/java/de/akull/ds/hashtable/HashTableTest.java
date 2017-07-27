package de.akull.ds.hashtable;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HashTableTest {

    @Test
    public void Should_Be_Able_To_Store_And_Retrieve_Values() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);

        assertThat(hashTable.get("A")).isEqualTo(1);
        assertThat(hashTable.get("B")).isEqualTo(2);
        assertThat(hashTable.get("C")).isEqualTo(3);
    }

    @Test
    public void Should_Be_Able_To_Resize() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);
        hashTable.put("D", 4);
        hashTable.put("E", 5);
        hashTable.put("F", 6);
        hashTable.put("G", 7);
        hashTable.put("H", 8);
        hashTable.put("I", 9);
        hashTable.put("J", 10);

        assertThat(hashTable.capacity).isEqualTo(20);
    }

    @Test
    public void Should_Work_With_Collisions() {
        HashTable<String, Integer> hashTable = new HashTable<>();

        hashTable.put("Teheran", 1);
        hashTable.put("Siblings", 2);

        assertThat(hashTable.get("Teheran")).isEqualTo(1);
        assertThat(hashTable.get("Siblings")).isEqualTo(2);
    }
}
