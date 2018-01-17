package org.starichkov.java.structures.list.linked;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 11:51
 */
final class Link<T> {
    private T value;
    private Link<T> next = null;

    Link(T item) {
        this.value = item;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }
}
