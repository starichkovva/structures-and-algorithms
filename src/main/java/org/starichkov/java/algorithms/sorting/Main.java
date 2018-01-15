package org.starichkov.java.algorithms.sorting;

import java.util.Random;

/**
 * @author Vadim Starichkov
 * @since 15.01.2018 15:32
 */
public final class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws Exception {
        Object instance = Class.forName(args[0]).newInstance();
        if (Sortable.class.isAssignableFrom(instance.getClass())) {
            int size = 10;
            int[] array = getRandomIntArray(size, 100);
            Sortable.class.cast(instance).sort(array);
        }
    }

    private static int[] getRandomIntArray(int size, int bound) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(bound);
        }
        return array;
    }
}
