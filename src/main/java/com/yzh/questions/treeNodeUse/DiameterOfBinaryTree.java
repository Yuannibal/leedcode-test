package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 */
public class DiameterOfBinaryTree {

    /**
     * 方法一：深度优先搜索
     *
     * 左儿子和右儿子求得它们为根的子树的深度 L和 R节点的直径
     * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(
                    Math.max(getMaxDepth(root.left) + getMaxDepth(root.right), diameterOfBinaryTree(root.left)),
                    diameterOfBinaryTree(root.right)
            );
        }
    }

    private int getMaxDepth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            return Math.max(getMaxDepth(treeNode.left), getMaxDepth(treeNode.right)) + 1;
        }
    }
}
