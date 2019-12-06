package de.akull.datastructures.heap;

import java.util.Arrays;


class Heap {

    int capacity = 10;
    int size = 0;
    int[] items = new int[capacity];

    boolean hasLeftChild(int i) {
        return getLeftChildIndex(i) < size;
    }

    int getLeftChildIndex(int i) {
        return 2 * i + 1;
    }

    int getLeftChild(int i) {
        return items[getLeftChildIndex(i)];
    }

    boolean hasRightChild(int i) {
        return getRightChildIndex(i) < size;
    }

    int getRightChildIndex(int i) {
        return 2 * i + 2;
    }

    int getRightChild(int i) {
        return items[getRightChildIndex(i)];
    }

    int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    void swap(int i, int j) {
        int tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }

    void checkCapacity() {
        if (size == capacity) {
            capacity *= 2;
            items = Arrays.copyOf(items, capacity);
        }
    }

    int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return items[0];
    }

    int poll() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        int first = items[0];
        items[0] = items[--size];
        bubbleDown();
        return first;
    }

    void add(int item) {
        checkCapacity();
        items[size++] = item;
        bubbleUp();
    }

    void bubbleUp() {
        int i = size - 1;

        int parentIndex = getParentIndex(i);
        while (parentIndex >= 0 && items[parentIndex] > items[i]) {
            swap(parentIndex, i);
            i = parentIndex;
        }
    }

    void bubbleDown() {
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
