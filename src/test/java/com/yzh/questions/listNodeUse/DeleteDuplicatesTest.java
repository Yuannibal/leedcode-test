package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 83. 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 * 返回同样按升序排列的结果链表。
 */
public class DeleteDuplicatesTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNodeUtils.print((new DeleteDuplicates()).deleteDuplicates(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNodeUtils.print((new DeleteDuplicates()).deleteDuplicates(head));
    }
}