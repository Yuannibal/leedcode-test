package com.yzh.questions.treeNodeUse.search;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 530. 二叉搜索树的最小绝对差
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 */
public class GetMinimumDifferenceTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(3, new TreeNode(2), null)
        );

        Assert.assertEquals(1, new GetMinimumDifference().getMinimumDifference1(root));
        Assert.assertEquals(1, new GetMinimumDifference().getMinimumDifference2(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(236,
                new TreeNode(104, null, new TreeNode(227)),
                new TreeNode(701, null, new TreeNode(911))
        );

        Assert.assertEquals(9, new GetMinimumDifference().getMinimumDifference1(root));
        Assert.assertEquals(9, new GetMinimumDifference().getMinimumDifference2(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(534,
                new TreeNode(384, null, new TreeNode(445)),
                new TreeNode(652, null, new TreeNode(699))
        );

        Assert.assertEquals(47, new GetMinimumDifference().getMinimumDifference1(root));
        Assert.assertEquals(47, new GetMinimumDifference().getMinimumDifference2(root));
    }
}