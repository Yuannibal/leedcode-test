package com.yzh.questions.listNodeUse;


import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 142. 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 */
public class DetectCycleTest {

    @Test
    public void test_1() {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(-4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        l4.next = l2;

        Assert.assertSame(l2, new DetectCycle().detectCycle1(l1));
    }

    @Test
    public void test_2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;

        l2.next = l1;

        Assert.assertSame(l1, new DetectCycle().detectCycle1(l1));
    }

    @Test
    public void test_3() {
        ListNode l1 = new ListNode(1);

        Assert.assertSame(null, new DetectCycle().detectCycle1(l1));
    }

}