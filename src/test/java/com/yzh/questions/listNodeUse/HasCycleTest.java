package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 */
public class HasCycleTest {

    @Test
    public void test_1() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        Assert.assertTrue((new HasCycle()).hasCycle1(l1));
        Assert.assertTrue((new HasCycle()).hasCycle2(l1));
    }

    @Test
    public void test_2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        l1.next = l2;
        l2.next = l1;

        Assert.assertTrue((new HasCycle()).hasCycle1(l1));
        Assert.assertTrue((new HasCycle()).hasCycle2(l1));
    }

    @Test
    public void test_3() {
        ListNode l1 = new ListNode(1);
        Assert.assertFalse((new HasCycle()).hasCycle1(l1));
        Assert.assertFalse((new HasCycle()).hasCycle2(l1));
    }

    @Test
    public void test_4() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        Assert.assertFalse((new HasCycle()).hasCycle1(l1));
        Assert.assertFalse((new HasCycle()).hasCycle2(l1));
    }

}