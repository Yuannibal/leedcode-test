package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 144. 二叉树的前序遍历
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class PreOrderTraversalTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );
        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, (new PreOrderTraversal()).preOrderTraversal(root).toArray());
    }

    @Test
    public void test_2() {
        Assert.assertArrayEquals(new Integer[]{}, (new PreOrderTraversal()).preOrderTraversal(null).toArray());
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1);
        Assert.assertArrayEquals(new Integer[]{1}, (new PreOrderTraversal()).preOrderTraversal(root).toArray());
    }
}