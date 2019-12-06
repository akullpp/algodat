package de.akull.algorithms;


class MergeSort {

    static void sort(int[] xs) {
        sort(xs, new int[xs.length], 0, xs.length - 1);
    }

    ;

    static void sort(int[] xs, int[] buffer, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(xs, buffer, low, mid);
        sort(xs, buffer, mid + 1, high);
        merge(xs, buffer, low, mid, high);
    }

    static void merge(int[] xs, int[] buffer, int low, int mid, int high) {
        System.arraycopy(xs, low, buffer, low, high + 1 - low);

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (buffer[i] <= buffer[j]) {
                xs[k] = buffer[i];
                i++;
            } else {
                xs[k] = buffer[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            xs[k] = buffer[i];
            k++;
            i++;
        }
    }
}
