package com.yzh.questions.listNodeUse;

import com.yzh.entity.ListNode;
import com.yzh.utils.ListNodeUtils;
import org.junit.Test;

/**
 * @Author: zihengyuan
 * @Date: 2021-06-23
 */
public class DeleteDuplicatesIITest {

    @Test
    public void test_1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        ListNodeUtils.print((new DeleteDuplicatesII()).deleteDuplicates(head));
    }
}