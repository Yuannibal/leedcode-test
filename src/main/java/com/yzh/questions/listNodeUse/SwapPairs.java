package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class SwapPairs {

    /**
     * 方法一:迭代
     */
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0, head);
        ListNode current = pre;
        while (current.next != null && current.next.next != null) {
            ListNode listNode1 = current.next;
            ListNode listNode2 = current.next.next;
            ListNode listNode3 = current.next.next.next;

            current.next = listNode2;
            (current.next).next = listNode1;
            (current.next.next).next = listNode3;

            current = current.next.next;
        }

        return pre.next;
    }
}
