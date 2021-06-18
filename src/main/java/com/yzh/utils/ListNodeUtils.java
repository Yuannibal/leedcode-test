package com.yzh.utils;


import com.yzh.entity.ListNode;

public class ListNodeUtils {

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
