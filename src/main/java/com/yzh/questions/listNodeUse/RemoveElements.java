package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 203. 移除链表元素
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
public class RemoveElements {

    /**
     * 哨兵节点
     * 时间复杂度：O(N)
     * 空间复杂度：O(1)
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode();
        pre.next = head;

        ListNode listNode = pre;
        while (null != listNode.next) {
            if (val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return pre.next;
    }
}
