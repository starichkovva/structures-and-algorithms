package org.starichkov.java.structures.list.linked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 11:41
 */
public final class BilateralLinkedList<T> {
    private Link<T> first = null;
    private Link<T> last = null;

    public void insertFirst(T item) {
        if (isEmpty()) {
            first = new Link<>(item);
            last = first;
        } else {
            Link<T> newFirst = new Link<>(item);
            newFirst.setNext(first);
            first = newFirst;
        }
    }

    public void insertLast(T item) {
        if (isEmpty()) {
            last = new Link<>(item);
            first = last;
        } else {
            Link<T> newLast = new Link<>(item);
            last.setNext(newLast);
            last = newLast;
        }
    }

    public T deleteFirst() throws IllegalStateException {
        if (first == null) {
            throw new IllegalStateException();
        }
        T firstValue = first.getValue();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        return firstValue;
    }

    public T getFirst() throws IllegalStateException {
        if (first == null) {
            throw new IllegalStateException();
        }
        return first.getValue();
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

    public boolean isEmpty() {
        return first == null && last == null;
    }
}
