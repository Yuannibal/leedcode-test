package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 104. 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class MaxDepth {

    /**
     * 方法一：深度优先搜索
     *
     * 如果我们知道了左子树和右子树的最大深度 l 和 r，那么该二叉树的最大深度即为
     * max(l,r)+1
     *
     * 时间复杂度：O(n)，其中 n 为二叉树节点的个数。每个节点在递归中只被遍历一次
     * 空间复杂度：O(height)，其中 height 表示二叉树的高度。
     * 递归函数需要栈空间，而栈空间取决于递归的深度，因此空间复杂度等价于二叉树的高度。
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
