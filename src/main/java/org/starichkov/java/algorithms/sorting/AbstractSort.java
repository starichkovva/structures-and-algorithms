package org.starichkov.java.algorithms.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Vadim Starichkov
 * @since 13.10.2016
 */
abstract class AbstractSort implements Sortable {

    @Override
    public void sort(int[] array) {
        doSort(array);
    }

    protected abstract void doSort(int[] array);

    String arrayToString(int[] array) {
        return Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + System.lineSeparator();
    }
}
