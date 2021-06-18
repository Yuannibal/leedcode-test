package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 100. 相同的树
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class IsSameTreeTest {

    @Test
    public void test_1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assert.assertTrue((new IsSameTree()).isSameTree(p, q));
    }

    @Test
    public void test_2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(3));
        Assert.assertFalse((new IsSameTree()).isSameTree(p, q));
    }

    @Test
    public void test_3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        Assert.assertFalse((new IsSameTree()).isSameTree(p, q));
    }
}