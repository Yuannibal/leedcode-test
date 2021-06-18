package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 404. 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 */
public class SumOfLeftLeavesTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(17))
        );
        Assert.assertEquals(24, (new SumOfLeftLeaves()).sumOfLeftLeaves(root));
    }
}