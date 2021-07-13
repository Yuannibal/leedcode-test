package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import com.yzh.utils.TreeNodeUtils;
import org.junit.Test;

/**
 * 114. 二叉树展开为链表
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 * （1）展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null。
 * （2）展开后的单链表应该与二叉树 先序遍历 顺序相同。
 */
public class FlattenTest {

    @Test
    public void test_11() {
        new Flatten().flatten1(null);
        TreeNodeUtils.printBreadth(null);
        System.out.println();
    }

    @Test
    public void test_12() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))
        );

        new Flatten().flatten1(root);
        TreeNodeUtils.printBreadth(root);
        System.out.println();
    }

    @Test
    public void test_21() {
        new Flatten().flatten2(null);
        TreeNodeUtils.printBreadth(null);
        System.out.println();
    }

    @Test
    public void test_22() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6))
        );

        new Flatten().flatten2(root);
        TreeNodeUtils.printBreadth(root);
        System.out.println();
    }
}