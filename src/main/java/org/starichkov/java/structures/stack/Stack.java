package org.starichkov.java.structures.stack;

import java.util.EmptyStackException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:24
 */
public interface Stack<T> {
    T peek() throws EmptyStackException;

    T pop() throws EmptyStackException;

    void push(T value) throws IllegalStateException;
}
