package de.akull.algorithms;

@SuppressWarnings("WeakerAccess")
public class QuickSort {

    public static void quicksort(int[] xs) {
        quicksort(xs, 0, xs.length - 1);
    }

    public static void quicksort(int[] xs, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = xs[(left + right) / 2];
        int index = partition(xs, left, right, pivot);
        quicksort(xs, left, index - 1);
        quicksort(xs, index, right);
    }

    public static int partition(int[] xs, int left, int right, int pivot) {
        while (left <= right) {
            while (xs[left] < pivot) {
                left++;
            }
            while (xs[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = xs[left];
                xs[left] = xs[right];
                xs[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}
