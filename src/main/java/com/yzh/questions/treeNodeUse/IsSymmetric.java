package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class IsSymmetric {

    /**
     * 方法一：递归
     *
     * 时间复杂度：这里遍历了这棵树，渐进时间复杂度为 O(n)
     * 空间复杂度：这里的空间复杂度和递归使用的栈空间有关，这里递归层数不超过 n，故渐进空间复杂度为 O(n)
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isSymmetric(root.left, root.right);
        }
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        // 都为null
        if (p == null && q == null) {
            return true;
        }

        // 任意一个不为null
        if (p == null || q == null) {
            return false;
        }

        return (p.val == q.val) && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}
