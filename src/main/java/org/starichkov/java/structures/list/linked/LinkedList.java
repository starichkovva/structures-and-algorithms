package org.starichkov.java.structures.list.linked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:23
 */
public final class LinkedList<T> {
    private Link<T> first = null;

    public void insertFirst(T item) {
        if (first == null) {
            first = new Link<>(item);
        } else {
            Link<T> newFirst = new Link<>(item);
            newFirst.setNext(first);
            first = newFirst;
        }
    }

    public T getFirst() throws IllegalStateException {
        if (first == null) {
            throw new IllegalStateException();
        }
        return first.getValue();
    }

    public T deleteFirst() throws IllegalStateException {
        if (first == null) {
            throw new IllegalStateException();
        }
        T firstValue = first.getValue();
        first = first.getNext();
        return firstValue;
    }

    public List<T> getItems() {
        List<T> items = new ArrayList<>();
        Link<T> next = first;
        while (next != null) {
            items.add(next.getValue());
            next = next.getNext();
        }
        return Collections.unmodifiableList(items);
    }
}
