package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;

/**
 * 147. 对链表进行插入排序
 *
 * 插入排序算法：
 * (1)插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * (2)每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * (3)重复直到所有输入数据插入完为止。
 *
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode pre = new ListNode(Integer.MIN_VALUE);
        pre.next = head;

        ListNode out = pre;
        while (out.next != null) {
            ListNode tempOut = (out.next).next;
            boolean isChange = false;  // 是否交换

            ListNode inner = pre;
            while (inner.next != out.next) {
                if ((inner.next).val > (out.next).val) {
                    ListNode tempInner = inner.next;
                    inner.next = out.next;
                    (inner.next).next = tempInner;
                    out.next = tempOut;
                    isChange = true;
                    break;
                }
                inner = inner.next;
            }
            if (!isChange) {
                out = out.next;
            }
        }

        return pre.next;
    }
}
