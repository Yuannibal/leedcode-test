package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 86. 分隔链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class Partition {

    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode();
        ListNode smallCurrent = smallHead;
        ListNode largeHead = new ListNode();
        ListNode largeCurrent = largeHead;

        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                smallCurrent.next = current;
                smallCurrent = smallCurrent.next;
            } else {  // current.val >= x
                largeCurrent.next = current;
                largeCurrent = largeCurrent.next;
            }
            current = current.next;
        }
        largeCurrent.next = null;

        smallCurrent.next = largeHead.next;
        return smallHead.next;
    }
}
