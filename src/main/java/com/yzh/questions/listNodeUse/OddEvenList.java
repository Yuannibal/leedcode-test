package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 328. 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 * 请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 */
public class OddEvenList {

    public ListNode oddEvenList(ListNode head) {
        // 偶哨兵和偶节点
        ListNode even_pre = new ListNode();
        ListNode even = even_pre;
        // 奇兵和奇节点
        ListNode odd_pre = new ListNode();
        ListNode odd = odd_pre;

        int num = 0;
        ListNode current = head;
        while (current != null) {
            if (num % 2 == 0) {
                even.next = current;
                even = even.next;
            } else {
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
            num++;
        }

        even.next = odd_pre.next;
        odd.next = null;
        return even_pre.next;
    }
}
