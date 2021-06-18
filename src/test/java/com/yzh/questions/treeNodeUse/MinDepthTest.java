package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class MinDepthTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );
        Assert.assertEquals(2, (new MinDepth()).minDepth(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(2, null,
                new TreeNode(3, null,
                        new TreeNode(4, null,
                                new TreeNode(5, null,
                                        new TreeNode(6))))
        );
        Assert.assertEquals(5, (new MinDepth()).minDepth(root));
    }
}