package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 1290. 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。
 * 已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 */
public class GetDecimalValueTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));
        Assert.assertEquals(5, (new GetDecimalValue()).getDecimalValue(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(0);
        Assert.assertEquals(0, (new GetDecimalValue()).getDecimalValue(head));
    }

    @Test
    public void test_3() {
        ListNode head = new ListNode(1);
        Assert.assertEquals(1, (new GetDecimalValue()).getDecimalValue(head));
    }

    @Test
    public void test_4() {
        int[] nums = {1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};

        ListNode pre = new ListNode();
        ListNode current = pre;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }

        Assert.assertEquals(18880, (new GetDecimalValue()).getDecimalValue(pre.next));
    }

    @Test
    public void test_5() {
        ListNode head = new ListNode(0, new ListNode(0));
        Assert.assertEquals(0, (new GetDecimalValue()).getDecimalValue(head));
    }

}