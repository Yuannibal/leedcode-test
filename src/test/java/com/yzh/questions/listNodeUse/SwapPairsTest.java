package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class SwapPairsTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNodeUtils.print((new SwapPairs()).swapPairs(head));
    }

    @Test
    public void test_2() {
        ListNodeUtils.print((new SwapPairs()).swapPairs(null));
    }

    @Test
    public void test_3() {
        ListNode head = new ListNode(1);
        ListNodeUtils.print((new SwapPairs()).swapPairs(head));
    }
}