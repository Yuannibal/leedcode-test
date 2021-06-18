package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 203. 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class RemoveElementsTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        int val = 3;
        ListNodeUtils.print((new RemoveElements()).removeElements(head, val));
    }

    @Test
    public void test_2() {
        int val = 3;
        ListNodeUtils.print((new RemoveElements()).removeElements(null, val));

    }

    @Test
    public void test_3() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));
        int val = 1;
        ListNodeUtils.print((new RemoveElements()).removeElements(head, val));
    }
}