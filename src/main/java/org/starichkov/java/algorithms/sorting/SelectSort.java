package org.starichkov.java.algorithms.sorting;

/**
 * @author Vadim Starichkov
 * @since 20.10.2016 21:40
 */
public class SelectSort extends AbstractSort {

    @Override
    protected void doSort(int[] array) {
        int size = array.length;

        System.out.println("Initial array:");
        System.out.println(arrayToString(array));

        int iteration = 1;
        for (int i = 0; i < size; i++) {
            int min = array[i];
            for (int j = i + 1; j < size; j++) {
                if (array[j] < min) {
                    min = array[j];
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
            System.out.println("After " + iteration + " iteration:");
            System.out.println(arrayToString(array));
            iteration++;
        }
    }
}
