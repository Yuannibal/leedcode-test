package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class RemoveNthFromEndTest {

    @Test
    public void test_11() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd1(head, n));
    }

    @Test
    public void test_12() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd1(head, n));
    }

    @Test
    public void test_13() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd1(head, n));
    }

    @Test
    public void test_14() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd1(head, n));
    }

    @Test
    public void test_21() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd2(head, n));
    }

    @Test
    public void test_22() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd2(head, n));
    }

    @Test
    public void test_23() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd2(head, n));
    }

    @Test
    public void test_24() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd2(head, n));
    }

    @Test
    public void test_31() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd3(head, n));
    }

    @Test
    public void test_32() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd3(head, n));
    }

    @Test
    public void test_33() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd3(head, n));
    }

    @Test
    public void test_34() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 2;
        ListNodeUtils.print(new RemoveNthFromEnd().removeNthFromEnd3(head, n));
    }
}