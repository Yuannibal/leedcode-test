package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoLists {

    /**
     * 方法一: 迭代
     *
     * 时间复杂度：O(n + m)，其中 n 和 m 分别为两个链表的长度。
     * 空间复杂度：O(1)
     */
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;

        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                result.next = l1;
                l1 = l1.next;
            } else {   // l1.val > l2.val
                result.next = l2;
                l2 = l2.next;
            }
            result = result.next;
        }

        result.next = (null == l1 ? l2 : l1);
        return head.next;
    }

    /**
     * 方法二: 递归
     *
     * 两个链表头部值较小的一个节点与剩下元素的 merge 操作结果合并
     * list1[0] + merge(list1[1:], list2) list1[0] <= list2[0]
     * list2[0] + merge(list1, list2[1:]) list1[0] > list2[0]
     *
     * 时间复杂度：O(n + m)，其中 n 和 m 分别为两个链表的长度
     * 空间复杂度：O(n + m)，其中 n 和 m 分别为两个链表的长度。递归调用 函数时需要消耗栈空间，栈空间的大小取决于递归调用的深度
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        // 边界情况: 如果 l1 或者 l2 一开始就是空链表 ,那么没有任何操作需要合并, 所以我们只需要返回非空链表
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {   // l1.val > l2.val
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}
