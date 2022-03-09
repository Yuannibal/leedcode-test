package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;

/**
 * 226. 翻转二叉树
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            // 左右子树交换
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
