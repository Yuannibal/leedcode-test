package com.yzh.questions.listNodeUse;


import com.yzh.entity.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 */
public class IsPalindromeTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2));
        Assert.assertFalse((new IsPalindrome()).isPalindrome(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assert.assertTrue((new IsPalindrome()).isPalindrome(head));
    }
}