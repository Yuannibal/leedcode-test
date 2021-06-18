package com.yzh.questions.listNodeUse;


import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 237. 删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 */
public class DeleteNodeTest {

    @Test
    public void test_1() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        (new DeleteNode()).deleteNode(a1);
        ListNodeUtils.print(a1);
    }

    @Test
    public void test_2() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        (new DeleteNode()).deleteNode(a2);
        ListNodeUtils.print(a1);
    }

    @Test
    public void test_3() {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(5);
        ListNode a3 = new ListNode(1);
        ListNode a4 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        (new DeleteNode()).deleteNode(a3);
        ListNodeUtils.print(a1);
    }
}