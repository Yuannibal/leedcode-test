package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int len = 1;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            len++;
        }

        current.next = head;
        current = current.next;

        ListNode temp = current;
        int aim = len - (k % len);
        while (aim > 0) {
            temp = current;
            current = current.next;
            aim--;
        }

        temp.next = null;
        return current;
    }
}
