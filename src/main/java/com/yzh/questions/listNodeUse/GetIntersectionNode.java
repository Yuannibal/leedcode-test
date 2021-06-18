package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 * 160. 相交链表
 * 找到两个单链表相交的起始节点
 *
 * 如果两个链表没有交点,返回 null
 * 在返回结果后，两个链表仍须保持原有的结构
 */
public class GetIntersectionNode {

    /**
     * 方法一: 哈希表
     * 时间复杂度 : O(m+n)
     * 空间复杂度 : O(m)或O(n)
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        ListNode listNode = headA;
        while (null != listNode) {
            set.add(listNode);
            listNode = listNode.next;
        }

        listNode = headB;
        while (null != listNode) {
            if (!set.add(listNode)) {
                return listNode;
            }
            listNode = listNode.next;
        }
        return null;
    }
}
