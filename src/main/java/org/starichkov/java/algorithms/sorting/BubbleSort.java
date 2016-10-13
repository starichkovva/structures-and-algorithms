package org.starichkov.java.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Vadim Starichkov
 * @since 13.10.2016 14:38
 */
public class BubbleSort {
    public static void main(String[] args) {
        new BubbleSort().sort();
    }

    private void sort() {
        int size = 10;

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

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

    private String arrayToString(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + System.lineSeparator();
    }
}
