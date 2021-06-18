package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import java.util.Stack;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class RemoveNthFromEnd {

    /**
     * 方法一：计算链表长度
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        // 建立哨兵
        ListNode pre = new ListNode(0, head);

        // 统计数量
        int len = 0;
        ListNode current = head;
        while (current != null) {
            len++;
            current = current.next;
        }

        // 到达删除的位置
        int target = len - n;
        current = pre;
        while (target > 0) {
            target--;
            current = current.next;
        }

        // 删除节点
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }

        return pre.next;
    }

    /**
     * 方法二：栈
     * 可以把哨兵节点放入栈栈中，栈就不会空了
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();

        // 建立哨兵
        ListNode pre = new ListNode(0, head);

        // 将所有的节点放入栈
        ListNode current = pre;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // 弹出
        while (n > 0) {
            stack.pop();
            n--;
        }

        // 删除节点
        stack.peek().next = stack.peek().next.next;

        return pre.next;
    }

    /**
     * 方法三：快慢指针
     */
    public ListNode removeNthFromEnd3(ListNode head, int n) {
        // 建立哨兵
        ListNode pre = new ListNode(0, head);

        // fast先于slow n布移动
        ListNode fast = pre;
        while (n > 0 && fast != null) {
            fast = fast.next;
            n--;
        }

        ListNode slow = pre;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return pre.next;
    }
}
