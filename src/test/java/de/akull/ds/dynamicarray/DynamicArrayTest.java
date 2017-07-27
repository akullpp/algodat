package de.akull.ds.dynamicarray;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DynamicArrayTest {

    @Test
    public void Should_Store_Items() throws Exception {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        assertThat(dynamicArray.size).isEqualTo(3);
        assertThat(dynamicArray.capacity).isEqualTo(3);
        assertThat(dynamicArray.array).contains(1, 2, 3);
    }

    @Test
    public void Should_Resize() throws Exception {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertThat(dynamicArray.size).isEqualTo(4);
        assertThat(dynamicArray.capacity).isEqualTo(6);
        assertThat(dynamicArray.array).contains(1, 2, 3, 4);
    }
}
