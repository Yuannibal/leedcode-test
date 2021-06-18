package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 206. 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class ReverseListTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNodeUtils.print((new ReverseList()).reverseList(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNodeUtils.print((new ReverseList()).reverseList(head));
    }

    @Test
    public void test_3() {
        ListNodeUtils.print((new ReverseList()).reverseList(null));
    }
}