package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class MergeTwoListsTest {

    @Test
    public void test_11() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists1(l1, l2));
    }

    @Test
    public void test_12() {
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists1(null, null));
    }

    @Test
    public void test_13() {
        ListNode l2 = new ListNode(0);
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists1(null, l2));
    }


    @Test
    public void test_21() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists2(l1, l2));
    }

    @Test
    public void test_22() {
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists2(null, null));
    }

    @Test
    public void test_23() {
        ListNode l2 = new ListNode(0);
        ListNodeUtils.print((new MergeTwoLists()).mergeTwoLists2(null, l2));
    }

}