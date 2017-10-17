package de.akull.algorithms;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    private final int[] SEARCH_SPACE = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    public void Should_Find_Element_If_Present() {
        int search = 7;

        int result = BinarySearch.search(SEARCH_SPACE, search);

        assertThat(result).isEqualTo(1);
    }

    @Test
    public void Should_Not_Find_Element_If_Not_Present() {
        int search = 10;

        int result = BinarySearch.search(SEARCH_SPACE, search);

        assertThat(result).isEqualTo(-1);
    }
}
