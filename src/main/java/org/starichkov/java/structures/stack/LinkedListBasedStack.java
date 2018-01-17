package org.starichkov.java.structures.stack;

import org.starichkov.java.structures.list.linked.LinkedList;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 12:26
 */
public class LinkedListBasedStack<T> implements Stack<T> {
    private LinkedList<T> list;

    public LinkedListBasedStack() {
        list = new LinkedList<>();
    }

    @Override
    public T peek() throws IllegalStateException {
        return list.getFirst();
    }

    @Override
    public T pop() throws IllegalStateException {
        return list.deleteFirst();
    }

    @Override
    public void push(T value) {
        list.insertFirst(value);
    }
}
