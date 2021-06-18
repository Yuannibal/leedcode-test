package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 */
public class HasCycle {

    /**
     * 方法一: 哈希表
     *
     * 时间复杂度：O(N)，其中 N 是链表中的节点数。
     * 空间复杂度：O(N)，其中 N 是链表中的节点数。主要为哈希表的开销
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (null != head) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 方法二: 快慢指针
     *
     * 时间复杂度：O(N)，其中 NN 是链表中的节点数
     * 空间复杂度：O(1)
     */
    public boolean hasCycle2(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
