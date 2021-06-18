package com.yzh.questions.treeNodeUse.search;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 501. 二叉搜索树中的众数
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）
 */
public class FindModeTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2, new TreeNode(2), null)
        );

        Assert.assertArrayEquals(new int[]{2},  new FindMode().findMode(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(2)
        );
        Assert.assertArrayEquals(new int[]{2},  new FindMode().findMode(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1, new TreeNode(1), new TreeNode(2)
        );
        Assert.assertArrayEquals(new int[]{1},  new FindMode().findMode(root));
    }
}