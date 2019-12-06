package de.akull.algorithms;

import java.util.Arrays;

class BinarySearch {

    static int search(int[] xs, int x) {
        int pivot = xs.length / 2;

        if (x == xs[pivot]) {
            return 1;
        }
        if (xs.length == 1) {
            return -1;
        }
        if (x < xs[pivot]) {
            return search(Arrays.copyOfRange(xs, 0, pivot - 1), x);
        }
        if (x > xs[pivot]) {
            return search(Arrays.copyOfRange(xs, pivot, xs.length), x);
        }
        return -1;
    }
}
