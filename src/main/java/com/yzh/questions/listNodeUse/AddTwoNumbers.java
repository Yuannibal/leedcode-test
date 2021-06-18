package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode current = pre;

        int carry = 0;
        while (l1 != null || l2 != null) {

            ListNode listNode;
            if (l1 != null && l2 != null) {
                listNode = new ListNode((l1.val + l2.val + carry) % 10);
                carry = (l1.val + l2.val + carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                listNode = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            } else { // l2 != null
                listNode = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            }
            current.next = listNode;
            current = current.next;

        }

        // 判断最后一位是否进位
        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return pre.next;
    }
}
