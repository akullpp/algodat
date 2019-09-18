package de.akull.datastructures.heap;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HeapTest {

    private Heap heap;

    @Before
    public void setup() {
        heap = new Heap();
    }

    @Test
    public void Should_Add_Items() {
        heap.add(1);
        heap.add(2);
        heap.add(3);

        assertThat(heap.size).isEqualTo(3);
        assertThat(heap.items).contains(1, 2, 3);
    }

    @Test
    public void Should_Have_The_Minimum_Value_As_Root() {
        heap.add(10);
        heap.add(1);
        heap.add(5);

        assertThat(heap.peek()).isEqualTo(1);
    }

    @Test
    public void Should_Retrieve_Root_Without_Removing() {
        heap.add(1);
        heap.add(2);
        heap.add(3);

        assertThat(heap.peek()).isEqualTo(1);
        assertThat(heap.size).isEqualTo(3);
    }

    @Test
    public void Should_Remove_Root_With_Reordering() {
        heap.add(10);
        heap.add(1);
        heap.add(5);

        heap.poll();
        assertThat(heap.peek()).isEqualTo(5);
    }

    @Test
    public void Should_Remove_Every_Node() {
        heap.add(1);
        heap.add(2);
        heap.add(3);

        heap.poll();
        heap.poll();
        heap.poll();

        assertThat(heap.size).isEqualTo(0);
    }
}
