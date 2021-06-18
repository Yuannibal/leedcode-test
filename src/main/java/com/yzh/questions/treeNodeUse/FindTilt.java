package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 563. 二叉树的坡度
 * 给定一个二叉树，计算 整个树 的坡度
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 */
public class FindTilt {

    public int findTilt(TreeNode root) {
        // 根节点为空
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {  // 叶子节点
            return 0;
        } else if (root.left != null && root.right != null) {
            return Math.abs(getSum(root.left) - getSum(root.right)) + findTilt(root.left) + findTilt(root.right);
        } else if (root.left != null) {
            return Math.abs(getSum(root.left)) + findTilt(root.left);
        } else { // root.right != null
            return Math.abs(getSum(root.right)) + findTilt(root.right);
        }
    }

    private int getSum(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        } else {
            return treeNode.val + getSum(treeNode.left) + getSum(treeNode.right);
        }
    }
}
