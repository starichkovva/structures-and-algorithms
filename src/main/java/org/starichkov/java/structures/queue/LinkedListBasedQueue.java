package org.starichkov.java.structures.queue;

import org.starichkov.java.structures.list.linked.BilateralLinkedList;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 12:34
 */
public class LinkedListBasedQueue<T> implements Queue<T> {
    private BilateralLinkedList<T> list;

    public LinkedListBasedQueue() {
        list = new BilateralLinkedList<>();
    }

    @Override
    public void add(T value) throws IllegalStateException {
        list.insertLast(value);
    }

    @Override
    public T peek() throws IllegalStateException {
        return list.getFirst();
    }

    @Override
    public T poll() throws IllegalStateException {
        return list.deleteFirst();
    }
}
