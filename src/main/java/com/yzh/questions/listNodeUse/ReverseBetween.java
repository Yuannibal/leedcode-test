package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 92. 反转链表 II
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class ReverseBetween {

    /**
     * 方法一：遍历
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = new ListNode();
        pre.next = head;

        // 找到left的前置节点
        ListNode current = pre;
        int leftPre = left - 1;
        while (leftPre > 0) {
            current = current.next;
            leftPre--;
        }
        ListNode leftPreNode = current;

        // 找到left节点
        current = current.next;
        ListNode leftNode = current;

        // 反转节点
        ListNode first = current;
        ListNode second = current.next;

        int len = right - left;
        while (len > 0) {
            ListNode temp = second.next;

            second.next = first;
            first = second;
            second = temp;
            len--;
        }

        // 调整边界节点
        leftPreNode.next = first;
        leftNode.next = second;

        return pre.next;
    }
}
