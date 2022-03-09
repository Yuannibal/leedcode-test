package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 617. 合并二叉树
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 */
public class MergeTreesTest {

    @Test
    public void test_1() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(3, new TreeNode(5), null),
                new TreeNode(2)
        );
        TreeNode root2 = new TreeNode(2,
                new TreeNode(1, null, new TreeNode(4)),
                new TreeNode(3, null, new TreeNode(7))
        );

        TreeNode treeNode = (new MergeTrees()).mergeTrees(root1, root2);

        TreeNode result = new TreeNode(3,
                new TreeNode(4, new TreeNode(5), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(7))
        );

        PreOrderTraversal preorderTraversal = new PreOrderTraversal();
        Assert.assertArrayEquals(
                preorderTraversal.preOrderTraversal(result).toArray(),
                preorderTraversal.preOrderTraversal(treeNode).toArray()
        );
    }


}