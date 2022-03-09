package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 110. 平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class IsBalanced {

    /**
     * 方法一：自顶向下的递归
     *
     * height(p) = 0                                       p 是空节点
     * height(p) = max(height(p.left,p.right)) + 1         p 是非节点
     *
     *
     * 空间复杂度：O(n)，其中 nn 是二叉树中的节点个数。空间复杂度主要取决于递归调用的层数，递归调用的层数不会超过 n。
     */
    public boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(maxDepth1(root.left) - maxDepth1(root.right)) <= 1
                    && isBalanced1(root.left) && isBalanced1(root.right);
        }
    }

    private int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
        }
    }

    /**
     * 方法二：自底向上的递归
     *
     */

}
