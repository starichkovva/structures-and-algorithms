package org.starichkov.java.structures.stack;

import java.util.EmptyStackException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:22
 */
public class ArrayBasedStack implements Stack<Integer> {
    private Integer[] array;
    private int last = -1;

    public ArrayBasedStack(int size) {
        array = new Integer[size];
    }

    @Override
    public Integer peek() throws EmptyStackException {
        if (last < 0) {
            throw new EmptyStackException();
        }
        return array[last];
    }

    @Override
    public Integer pop() throws EmptyStackException {
        if (last < 0) {
            throw new EmptyStackException();
        }
        Integer item = array[last];
        array[last] = null;
        last--;
        return item;
    }

    @Override
    public void push(Integer value) throws IllegalStateException {
        if (last + 1 >= array.length) {
            throw new IllegalStateException();
        }
        array[++last] = value;
    }
}
