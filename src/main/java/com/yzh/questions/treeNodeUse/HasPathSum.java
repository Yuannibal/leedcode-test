package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 112. 路径总和
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum ，
 * 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
 */
public class HasPathSum {

    /**
     * 方法一：递归
     *
     * 时间复杂度：O(N)，其中 N 是树的节点数。对每个节点访问一次。
     * 空间复杂度：O(H)，其中 H 是树的高度。空间复杂度主要取决于递归时栈空间的开销，最坏情况下，树呈现链状，空间复杂度为O(N)。
     * 平均情况下树的高度与节点数的对数正相关，空间复杂度为 O(logN)。
     *
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (targetSum == root.val && (root.left == null && root.right == null)) {
            return true;
        } else {
            return hasPathSum(root.left, targetSum - root.val)
                    || hasPathSum(root.right, targetSum - root.val);
        }
    }
}
