package de.akull.ds.mergesort;

@SuppressWarnings("WeakerAccess")
public class MergeSort {

    public int[] xs;
    public int[] buffer;

    public MergeSort(int[] xs) {
        this.xs = xs;
        this.buffer = new int[xs.length];
        sort(0, xs.length - 1);
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort(new int[]{2, 5, 6, 9, 1, 4, 2, 40, 3});

        for (int i : ms.xs) {
            System.out.print(String.format("${}", i));
        }
    }

    public void sort(int low, int high) {
        if (low == high) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(low, mid);
        sort(mid + 1, high);
        merge(low, mid + 1, high);
    }

    public void merge(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            buffer[i] = xs[i];
        }

        int i = low;
        int j = mid;
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
