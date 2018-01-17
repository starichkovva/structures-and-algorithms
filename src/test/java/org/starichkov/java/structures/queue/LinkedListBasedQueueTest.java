package org.starichkov.java.structures.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 12:39
 */
public class LinkedListBasedQueueTest {
    private Queue<Integer> integerQueue;

    @Before
    public void init() {
        integerQueue = new LinkedListBasedQueue<>();
    }

    @Test
    public void test() {
        try {
            Integer value = integerQueue.peek();
            Assert.fail(String.format("Queue is not empty! Peeked value is %d", value));
        } catch (IllegalStateException e) {
        }

        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        integerQueue.add(40);
        integerQueue.add(50);

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
        } catch (IllegalStateException e) {
        }
    }
}
