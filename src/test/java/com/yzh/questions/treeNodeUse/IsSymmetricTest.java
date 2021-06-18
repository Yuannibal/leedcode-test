package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class IsSymmetricTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        Assert.assertTrue((new IsSymmetric()).isSymmetric(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );
        Assert.assertFalse((new IsSymmetric()).isSymmetric(root));
    }
}