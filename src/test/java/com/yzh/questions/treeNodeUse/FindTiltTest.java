package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 563. 二叉树的坡度
 * 给定一个二叉树，计算 整个树 的坡度
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 */
public class FindTiltTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assert.assertEquals(1, new FindTilt().findTilt(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7))
        );
        Assert.assertEquals(15, new FindTilt().findTilt(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(21,
                new TreeNode(7,
                        new TreeNode(1, new TreeNode(3), new TreeNode(3)),
                        new TreeNode(1)
                ),
                new TreeNode(14, new TreeNode(2), new TreeNode(2))
        );
        Assert.assertEquals(9, new FindTilt().findTilt(root));
    }

}