package org.starichkov.java.algorithms.sorting;

/**
 * @author Vadim Starichkov
 * @since 15.01.2018 19:03
 */
public class InsertSort extends AbstractSort {
    @Override
    protected void doSort(int[] array) {
        int size = array.length;

        System.out.println("Initial array:");
        System.out.println(arrayToString(array));

        int iteration = 1;
        for (int i = 1; i < size; i++) {
            int marked = array[i];
            int j = i;
            while (j > 0 && array[j - 1] >= marked) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = marked;

            System.out.println("After " + iteration + " iteration:");
            System.out.println(arrayToString(array));
            iteration++;
        }
    }
}
