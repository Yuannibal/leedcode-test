package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * 147. 对链表进行插入排序
 *
 * 插入排序算法：
 * (1)插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * (2)每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * (3)重复直到所有输入数据插入完为止。
 */
public class InsertionSortListTest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNodeUtils.print((new InsertionSortList()).insertionSortList(head));
    }

    @Test
    public void test_2() {
        ListNode head = new ListNode(-1, new ListNode(5, new ListNode(3, new ListNode(4, new ListNode(0)))));
        ListNodeUtils.print((new InsertionSortList()).insertionSortList(head));
    }
}