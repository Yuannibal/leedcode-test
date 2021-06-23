package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class RotateRightTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNodeUtils.print((new RotateRight().rotateRight(head, 2)));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(2)));
        ListNodeUtils.print((new RotateRight().rotateRight(head, 4)));
    }

    @Test
    public void test_3() {
        ListNodeUtils.print((new RotateRight().rotateRight(null, 4)));
    }
}