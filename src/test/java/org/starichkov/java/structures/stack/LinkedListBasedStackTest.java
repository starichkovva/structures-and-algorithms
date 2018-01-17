package org.starichkov.java.structures.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 12:31
 */
public class LinkedListBasedStackTest {
    private Stack<Integer> integerStack;

    @Before
    public void init() {
        integerStack = new LinkedListBasedStack<>();
    }

    @Test
    public void test() {

        try {
            integerStack.peek();
            Assert.fail("Stack is empty!");
        } catch (IllegalStateException e) {
        }

        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);

        Integer value = integerStack.peek();
        Assert.assertEquals(50, value.intValue());

        value = integerStack.pop();
        Assert.assertEquals(50, value.intValue());

        value = integerStack.pop();
        Assert.assertEquals(40, value.intValue());

        value = integerStack.pop();
        Assert.assertEquals(30, value.intValue());

        value = integerStack.pop();
        Assert.assertEquals(20, value.intValue());

        value = integerStack.peek();
        Assert.assertEquals(10, value.intValue());

        value = integerStack.pop();
        Assert.assertEquals(10, value.intValue());

        try {
            value = integerStack.peek();
            Assert.fail(String.format("Stack not empty! Value is %d", value));
        } catch (IllegalStateException e) {
        }
    }
}