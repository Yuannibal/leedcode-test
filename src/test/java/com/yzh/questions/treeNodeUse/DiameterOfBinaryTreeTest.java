package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 */
public class DiameterOfBinaryTreeTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );
        Assert.assertEquals(3, new DiameterOfBinaryTree().diameterOfBinaryTree(root));
    }
}