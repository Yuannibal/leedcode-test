package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 1290. 二进制链表转整数
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。
 * 已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 */
public class GetDecimalValue {

    /**
     * 模拟
     *
     * 时间复杂度：O(N)，其中 NN 是链表中的节点个数
     * 空间复杂度：O(1)
     */
    public int getDecimalValue(ListNode head) {
        ListNode listNode = head;
        int result = 0;

        while (null != listNode) {
            result = result * 2 + listNode.val;
            listNode = listNode.next;
        }

        return result;
    }
}
