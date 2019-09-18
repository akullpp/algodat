package de.akull.datastructures.hashtable;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.UUID;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {

    private HashTable<String, Integer> hashTable;

    @Before
    public void setup() {
        hashTable = new HashTable<>();
    }

    @Test
    public void Should_Retrieve_Stored_Values() {
        hashTable.put("A", 1);
        hashTable.put("B", 2);
        hashTable.put("C", 3);

        assertThat(hashTable.size).isEqualTo(3);
        assertThat(hashTable.get("A")).isEqualTo(1);
        assertThat(hashTable.get("B")).isEqualTo(2);
        assertThat(hashTable.get("C")).isEqualTo(3);
    }

    @Test
    public void Should_Resize() {
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

        assertThat(hashTable.size).isEqualTo(10);
        assertThat(hashTable.capacity).isEqualTo(20);
        assertThat(hashTable.buckets.length).isEqualTo(hashTable.capacity);
    }

    @Test
    public void Should_Work_With_Collisions() {
        hashTable.put("Teheran", 1);
        hashTable.put("Siblings", 2);

        LinkedList bucket = hashTable.buckets[3];
        assertThat(bucket.head.key).isEqualTo("Teheran");
        assertThat(bucket.tail.key).isEqualTo("Siblings");
    }

    @Test
    public void Should_Compute_Indices_In_Range() {
        for (int i = 0; i < 100; i++) {
            assertThat(hashTable.computeIndex(UUID.randomUUID().toString())).isBetween(0, hashTable.capacity);
        }
    }
}
