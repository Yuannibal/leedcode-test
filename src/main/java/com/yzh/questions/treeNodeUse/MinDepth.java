package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 111. 二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 */
public class MinDepth {

    /**
     * 方法一：深度优先搜索
     *
     * 时间复杂度：O(N)，其中 N 是树的节点数。对每个节点访问一次
     * 空间复杂度：O(H)，其中 H 是树的高度。空间复杂度主要取决于递归时栈空间的开销，最坏情况下，树呈现链状，空间复杂度为 O(N)。
     * 平均情况下树的高度与节点数的对数正相关，空间复杂度为 O(logN)。
     *
     */
    public int minDepth(TreeNode root) {
        // 没有节点
        if (root == null) {
            return 0;
        }

        // 与 二叉树的最大深度相比,要小心非叶子节点
        if (root.left == null && root.right == null) {  // 叶子节点
            return 1;
        } else if (root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        } else if (root.left == null) {  // root.left == null && root.right != null
            return minDepth(root.right) + 1;
        } else {                         // root.left != null && root.right != null
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

}
