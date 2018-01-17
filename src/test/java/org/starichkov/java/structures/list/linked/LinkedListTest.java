package org.starichkov.java.structures.list.linked;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 11:18
 */
public class LinkedListTest {
    private LinkedList<Integer> integerLinkedList;

    @Before
    public void init() {
        integerLinkedList = new LinkedList<>();
    }

    @Test
    public void test() {
        List<Integer> items = integerLinkedList.getItems();
        Assert.assertEquals(0, items.size());

        integerLinkedList.insertFirst(10);
        integerLinkedList.insertFirst(20);
        integerLinkedList.insertFirst(30);

        items = integerLinkedList.getItems();
        Assert.assertEquals(3, items.size());

        Assert.assertEquals(30, items.get(0).intValue());
        Assert.assertEquals(20, items.get(1).intValue());
        Assert.assertEquals(10, items.get(2).intValue());

        Integer deleted = integerLinkedList.deleteFirst();
        Assert.assertEquals(30, deleted.intValue());

        deleted = integerLinkedList.deleteFirst();
        Assert.assertEquals(20, deleted.intValue());

        deleted = integerLinkedList.deleteFirst();
        Assert.assertEquals(10, deleted.intValue());

        try {
            deleted = integerLinkedList.deleteFirst();
            Assert.fail(String.format("List is not empty! Last deleted value is %d", deleted));
        } catch (IllegalStateException e) {
        }
    }
}
