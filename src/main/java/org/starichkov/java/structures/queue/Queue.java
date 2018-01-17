package org.starichkov.java.structures.queue;

import java.util.NoSuchElementException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:45
 */
public interface Queue<T> {
    void add(T value) throws IllegalStateException;

    T peek() throws NoSuchElementException;

    T poll() throws NoSuchElementException;
}
