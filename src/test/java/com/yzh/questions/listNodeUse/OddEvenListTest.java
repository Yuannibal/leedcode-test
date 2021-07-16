package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 328. 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 * 请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 */
public class OddEvenListTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNodeUtils.print((new OddEvenList()).oddEvenList(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(2, new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(6, new ListNode(4 , new ListNode(7)))))));
        ListNodeUtils.print((new OddEvenList()).oddEvenList(head));
    }
}