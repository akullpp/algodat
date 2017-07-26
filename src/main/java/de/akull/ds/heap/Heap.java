package de.akull.ds.heap;

import java.util.Arrays;

public class Heap {

    private int capacity = 10;
    private int size = 0;
    private int[] items = new int[capacity];

    public boolean hasLeftChild(int i) {
        return getLeftChildIndex(i) < size;
    }

    public int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    public int getLeftChild(int i) {
        return items[getLeftChildIndex(i)];
    }

    public boolean hasRightChild(int i) {
        return getRightChildIndex(i) < size;
    }

    public int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    public int getRightChild(int i) {
        return items[getRightChildIndex(i)];
    }

    public int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    public int getParent(int i) {
        return items[getParentIndex(i)];
    }

    private void swap(int i, int j) {
        int tmp = items[i];
        items[i] = items[j];
        items[j] = items[tmp];
    }

    private void checkCapacity() {
        if (size == capacity) {
            capacity *= 2;
            items = Arrays.copyOf(items, capacity);
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int first = items[0];
        items[0] = items[--size];
        bubbleDown();
        return first;
    }

    public void add(int item) {
        checkCapacity();
        items[size++] = item;
        bubbleUp();
    }

    public void bubbleUp() {
        int i = size - 1;

        int parentIndex = getParentIndex(i);
        while (parentIndex >= 0 && items[parentIndex] > items[i]) {
            swap(parentIndex, i);
            i = parentIndex;
        }
    }

    public void bubbleDown() {
        int i = 0;

        while (hasLeftChild(i)) {
            int smallerChildIndex = getLeftChildIndex(i);
            if (hasRightChild(i) && getLeftChild(i) < getRightChild(i)) {
                smallerChildIndex = getRightChild(i);
            }
            if (items[i] < items[smallerChildIndex]) {
                break;
            } else {
                swap(i, smallerChildIndex);
                i = smallerChildIndex;
            }
        }
    }
}
