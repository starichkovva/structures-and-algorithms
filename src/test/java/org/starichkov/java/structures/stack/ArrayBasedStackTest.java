package org.starichkov.java.structures.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 10:37
 */
public class ArrayBasedStackTest {
    private Stack<Integer> integerStack;

    @Before
    public void init() {
        integerStack = new ArrayBasedStack(5);
    }

    @Test
    public void test() {
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);
        integerStack.push(40);
        integerStack.push(50);

        try {
            integerStack.push(60);
            Assert.fail("Stack is not full yet!");
        } catch (IllegalStateException e) {
        }

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
        } catch (EmptyStackException e) {
        }
    }
}
