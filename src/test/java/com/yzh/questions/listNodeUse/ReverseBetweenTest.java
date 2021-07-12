package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 92. 反转链表 II
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class ReverseBetweenTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int left = 2;
        int right = 4;

        ListNodeUtils.print(new ReverseBetween().reverseBetween(head, left, right));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(5);
        int left = 1;
        int right = 1;

        ListNodeUtils.print(new ReverseBetween().reverseBetween(head, left, right));
    }


}