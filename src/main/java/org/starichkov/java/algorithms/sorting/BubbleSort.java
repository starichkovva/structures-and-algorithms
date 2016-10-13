package org.starichkov.java.algorithms.sorting;

/**
 * @author Vadim Starichkov
 * @since 13.10.2016 14:38
 */
public class BubbleSort extends AbstractSort {
    public static void main(String[] args) {
        new BubbleSort().sort();
    }

    private void sort() {
        int size = 10;
        int[] array = getRandomIntArray(size, 100);

        System.out.println("Initial array:");
        System.out.println(arrayToString(array));

        int iteration = 1;
        for (int s = size; s > 0; s--) {
            for (int i = 0; i < s - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }
            System.out.println("After " + iteration + " iteration:");
            System.out.println(arrayToString(array));
            iteration++;
        }
    }
}
