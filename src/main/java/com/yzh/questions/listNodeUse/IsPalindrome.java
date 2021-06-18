package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import java.util.Stack;

/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 */
public class IsPalindrome {

    /**
     * 方法一:栈
     *
     */
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode listNode = head;
        while (null != listNode) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        listNode = head;
        while (null != listNode) {
            if (stack.pop() != listNode.val) {
                return false;
            }
            listNode = listNode.next;
        }
        return true;
    }
}
