package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class IsBalancedTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        Assert.assertTrue((new IsBalanced()).isBalanced1(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2)
        );
        Assert.assertFalse((new IsBalanced()).isBalanced1(root));
    }

    @Test
    public void test_3() {
        Assert.assertTrue((new IsBalanced()).isBalanced1(null));
    }
}