package com.yzh.questions.treeNodeUse;


import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 145. 二叉树的后序遍历(右左中)
 * 给定一个二叉树，返回它的 后序 遍历。
 */
public class PostOrderTraversalTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );
        Assert.assertArrayEquals(new Integer[]{3, 2, 1}, (new PostOrderTraversal()).postOrderTraversal(root).toArray());
    }
}