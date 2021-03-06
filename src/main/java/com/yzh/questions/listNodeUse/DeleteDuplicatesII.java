package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class DeleteDuplicatesII {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode first = pre;
        ListNode second = head;
        ListNode third = head.next;
        while (third != null) {
            if (second.val != third.val) {
                first = first.next;
                second = second.next;
                third = third.next;
            } else { // second.val == third.val
                while (third != null && second.val == third.val) {
                    third = third.next;
                }
                first.next = third;
                second = third;

                if (third == null) {
                    break;
                } else {
                    third = third.next;
                }
            }
        }
        return pre.next;
    }
}
