package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 404. 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 */
public class SumOfLeftLeaves {

    /**
     * 方法一：深度优先搜索
     *
     * 时间复杂度：O(n)，其中 n 是树中的节点个数
     * 空间复杂度：O(n)O(n)。空间复杂度与深度优先搜索使用的栈的最大深度相关。
     * 在最坏的情况下，树呈现链式结构，深度为 O(n)，对应的空间复杂度也为 O(n)
     */
    public int sumOfLeftLeaves(TreeNode root) {
        // 空节点
        if (root == null) {
            return 0;
        }

        // 左叶子节点
        if (root.left != null && (root.left.left == null && root.left.right == null)) {
            return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        } else {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
