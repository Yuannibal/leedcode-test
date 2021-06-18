package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 206. 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class ReverseList {

    /**
     * 方法一: 哨兵 + 迭代
     * 时间复杂度：O(n)，其中 n 是链表的长度。需要遍历链表一次
     * 空间复杂度：O(1)
     */
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        ListNode second = head;

        while (null != second) {
            ListNode note = second.next;

            second.next = first;
            first = second;
            second = note;
        }
        return first;
    }
}
