package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 876. 链表的中间结点
 *
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode {

    /**
     * 方法一：单指针法
     *
     * 时间复杂度：O(2N)，其中 N 是给定链表的结点数目。
     * 空间复杂度：O(1)，只需要常数空间存放变量和指针。
     */
    public ListNode middleNode1(ListNode head) {
        ListNode pre =  new ListNode();
        pre.next = head;

        // 第一遍遍历
        int len = 0;
        ListNode listNode = pre;
        while (null != listNode.next) {
            listNode = listNode.next;
            len++;
        }

        // 第二遍遍历
        len = (len / 2) + 1;
        listNode = pre;
        while (len > 0) {
            listNode = listNode.next;
            len--;
        }

        return listNode;
    }

    /**
     * 方法二：快慢指针法
     *
     * 时间复杂度：O(N)，其中 N 是给定链表的结点数目。
     * 空间复杂度：O(1)，只需要常数空间存放 slow 和 fast 两个指针
     */
    public ListNode middleNode2(ListNode head) {
        ListNode slow =  head;
        ListNode fast =  head;

        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
