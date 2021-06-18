package com.yzh.questions.listNodeUse;


import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 876. 链表的中间结点
 *
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNodeTest {

    @Test
    public void test_1() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        Assert.assertSame(3, (new MiddleNode()).middleNode1(l1).val);
        Assert.assertSame(3, (new MiddleNode()).middleNode2(l1).val);
    }

    @Test
    public void test_2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        Assert.assertSame(4, (new MiddleNode()).middleNode1(l1).val);
        Assert.assertSame(4, (new MiddleNode()).middleNode2(l1).val);
    }
}