package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 * 返回同样按升序排列的结果链表。
 */
public class DeleteDuplicatesI {

    /**
     * 时间复杂度：O(n)，其中 n 是链表的长度
     * 空间复杂度：O(1)。
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }

        ListNode result = head;
        while (null != result.next) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            } else {   // result.val != result.next.val
                result = result.next;
            }
        }

        return head;
    }
}
