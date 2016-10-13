package org.starichkov.java.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Vadim Starichkov
 * @since 13.10.2016
 */
abstract class AbstractSort {
    private final Random random = new Random();

    int[] getRandomIntArray(int size, int bound) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    String arrayToString(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + System.lineSeparator();
    }
}
