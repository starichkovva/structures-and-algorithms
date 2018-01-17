package org.starichkov.java.structures.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 11:09
 */
public class ArrayBasedQueueTest {
    private Queue<Integer> integerQueue;

    @Before
    public void init() {
        integerQueue = new ArrayBasedQueue(5);
    }

    @Test
    public void test() {
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);
        integerQueue.add(50);

        try {
            integerQueue.add(60);
            Assert.fail("Queue is not full yet!");
        } catch (IllegalStateException e) {
        }

        Integer value = integerQueue.peek();
        Assert.assertEquals(10, value.intValue());

        value = integerQueue.poll();
        Assert.assertEquals(10, value.intValue());

        value = integerQueue.poll();
        Assert.assertEquals(20, value.intValue());

        value = integerQueue.poll();
        Assert.assertEquals(30, value.intValue());

        value = integerQueue.poll();
        Assert.assertEquals(40, value.intValue());

        value = integerQueue.peek();
        Assert.assertEquals(50, value.intValue());

        value = integerQueue.poll();
        Assert.assertEquals(50, value.intValue());

        try {
            value = integerQueue.poll();
            Assert.fail(String.format("Queue not empty! Value is %d", value));
        } catch (NoSuchElementException e) {
        }
    }
}
