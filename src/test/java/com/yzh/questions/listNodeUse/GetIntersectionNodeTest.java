package com.yzh.questions.listNodeUse;


import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 160. 相交链表
 * 找到两个单链表相交的起始节点
 *
 * 如果两个链表没有交点,返回 null
 * 在返回结果后，两个链表仍须保持原有的结构
 */
public class GetIntersectionNodeTest {

    @Test
    public void test_1() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        a1.next = a2;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(0);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;

        ListNode c1 = new ListNode(8, new ListNode(4, new ListNode(5)));
        b3.next = c1;
        a2.next = c1;

        Assert.assertSame(c1, (new GetIntersectionNode()).getIntersectionNode(a1, b1));
    }

    @Test
    public void test_2() {
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;

        ListNode b1 = new ListNode(3);

        ListNode c1 = new ListNode(2, new ListNode(4));
        a3.next = c1;
        b1.next = c1;

        Assert.assertSame(c1, (new GetIntersectionNode()).getIntersectionNode(a1, b1));
    }

    @Test
    public void test_3() {
        ListNode a1 = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode b1 = new ListNode(1, new ListNode(5));

        Assert.assertSame(null, (new GetIntersectionNode()).getIntersectionNode(a1, b1));
    }
}