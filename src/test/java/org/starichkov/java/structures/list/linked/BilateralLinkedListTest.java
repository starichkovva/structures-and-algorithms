package org.starichkov.java.structures.list.linked;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author Vadim Starichkov
 * @since 17.01.2018 11:57
 */
public class BilateralLinkedListTest {
    private BilateralLinkedList<Integer> integerList;

    @Before
    public void init() {
        integerList = new BilateralLinkedList<>();
    }

    @Test
    public void test() {
        List<Integer> items = integerList.getItems();
        Assert.assertEquals(0, items.size());

        integerList.insertFirst(10);
        integerList.insertLast(20);

        items = integerList.getItems();
        Assert.assertEquals(2, items.size());
        Assert.assertEquals(10, items.get(0).intValue());
        Assert.assertEquals(20, items.get(1).intValue());

        integerList.insertFirst(5);
        integerList.insertLast(30);

        items = integerList.getItems();
        Assert.assertEquals(4, items.size());
        Assert.assertEquals(5, items.get(0).intValue());
        Assert.assertEquals(10, items.get(1).intValue());
        Assert.assertEquals(20, items.get(2).intValue());
        Assert.assertEquals(30, items.get(3).intValue());

        Integer deleted = integerList.deleteFirst();
        Assert.assertEquals(5, deleted.intValue());

        deleted = integerList.deleteFirst();
        Assert.assertEquals(10, deleted.intValue());

        items = integerList.getItems();
        Assert.assertEquals(2, items.size());
        Assert.assertEquals(20, items.get(0).intValue());
        Assert.assertEquals(30, items.get(1).intValue());

        deleted = integerList.deleteFirst();
        Assert.assertEquals(20, deleted.intValue());

        deleted = integerList.deleteFirst();
        Assert.assertEquals(30, deleted.intValue());

        Assert.assertTrue(integerList.isEmpty());

        items = integerList.getItems();
        Assert.assertTrue(items.isEmpty());

        try {
            deleted = integerList.deleteFirst();
            Assert.fail(String.format("List is not empty! Last deleted value is %d", deleted));
        } catch (IllegalStateException e) {
        }
    }
}
