package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 86. 分隔链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class PartitionTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1,
                new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        int x = 3;
        ListNodeUtils.print((new Partition()).partition(head, x));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(2, new ListNode(1));
        int x = 2;
        ListNodeUtils.print((new Partition()).partition(head, x));
    }
}