package org.starichkov.java.structures.queue;

import java.util.NoSuchElementException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:45
 */
public class ArrayBasedQueue implements Queue<Integer> {
    private Integer[] array;
    private int last = -1;

    public ArrayBasedQueue(int size) {
        array = new Integer[size];
    }

    @Override
    public void add(Integer value) throws IllegalStateException {
        if (last + 1 >= array.length) {
            throw new IllegalStateException();
        }
        array[++last] = value;
    }

    @Override
    public Integer peek() throws NoSuchElementException {
        if (last < 0) {
            throw new NoSuchElementException();
        }
        return array[0];
    }

    @Override
    public Integer poll() throws NoSuchElementException {
        if (last < 0) {
            throw new NoSuchElementException();
        }
        Integer value = array[0];
        array[0] = null;

        // shift left
        for (int i = 1; i < array.length; i++) {
            Integer item = array[i];
            array[i] = null;
            array[i - 1] = item;
        }

        last--;

        return value;
    }
}
