package org.starichkov.java.structures.list.linked;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:23
 */
public class LinkedList<T> {
    private Link first = null;

    public void insertFirst(T item) {
        if (first == null) {
            first = new Link(item);
        } else {
            Link newFirst = new Link(item);
            newFirst.next = first;
            first = newFirst;
        }
    }

    public T deleteFirst() throws IllegalStateException {
        if (first == null) {
            throw new IllegalStateException();
        }
        T firstValue = first.value;
        first = first.next;
        return firstValue;
    }

    public List<T> getItems() {
        List<T> items = new ArrayList<>();
        Link next = first;
        while (next != null) {
            items.add(next.value);
            next = next.next;
        }
        return Collections.unmodifiableList(items);
    }

    private class Link {
        private T value;
        private Link next = null;

        Link(T item) {
            this.value = item;
        }
    }
}
