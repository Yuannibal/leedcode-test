package com.yzh.questions.treeNodeUse.search;

import com.yzh.entity.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * 235. 二叉搜索树的最近公共祖先
 *
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
 */
public class LowestCommonAncestorTest {

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2,
                new TreeNode(0, null, null),
                new TreeNode(4, new TreeNode(3), new TreeNode(5))
        );
        TreeNode q = new TreeNode(8,
                new TreeNode(7),
                new TreeNode(9)
        );
        root.left = p;
        root.right = q;

        Assert.assertSame(root, (new LowestCommonAncestor()).lowestCommonAncestor(root, p, q));
    }

    @Test
    public void test_2() {
        TreeNode q = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        TreeNode p = new TreeNode(2,
                new TreeNode(0, null, null),
                q);
        TreeNode root = new TreeNode(6,
                p,
                new TreeNode(8, new TreeNode(7), new TreeNode(9))
        );

        root.left = p;
        root.right = q;

        Assert.assertSame(p, (new LowestCommonAncestor()).lowestCommonAncestor(root, p, q));
    }


}