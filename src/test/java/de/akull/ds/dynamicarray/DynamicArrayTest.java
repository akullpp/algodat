package de.akull.ds.dynamicarray;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DynamicArrayTest {

    @Test
    public void Should_Add_Items_And_Double_Capacity_When_Needed() throws Exception {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        assertThat(dynamicArray.getSize()).isEqualTo(4);
        assertThat(dynamicArray.getCapacity()).isEqualTo(6);
        assertThat(dynamicArray.getArray()).contains(1, 2, 3, 4);
    }
}
