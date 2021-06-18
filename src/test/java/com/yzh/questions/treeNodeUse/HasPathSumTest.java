package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 112. 路径总和
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 */
public class HasPathSumTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1))
                )
        );
        int targetSum = 22;
        Assert.assertTrue((new HasPathSum()).hasPathSum(root, targetSum));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int targetSum = 5;
        Assert.assertFalse((new HasPathSum()).hasPathSum(root, targetSum));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        int targetSum = 0;
        Assert.assertFalse((new HasPathSum()).hasPathSum(root, targetSum));
    }

    @Test
    public void test_4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        int targetSum = 1;
        Assert.assertFalse((new HasPathSum()).hasPathSum(root, targetSum));
    }

}