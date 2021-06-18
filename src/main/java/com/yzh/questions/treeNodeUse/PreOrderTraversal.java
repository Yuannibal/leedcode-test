package com.yzh.questions.treeNodeUse;

import com.yzh.entity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历(中左右)
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class PreOrderTraversal {

    /**
     * 方法一：递归
     *
     * 时间复杂度：O(n)，其中 n 是二叉树的节点数。每一个节点恰好被遍历一次。
     * 空间复杂度：O(n)，为递归过程中栈的开销，平均情况下为 O(LogN)，最坏情况下树呈现链状，为 O(n)。
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    private void preOrderTraversal(TreeNode treeNode, List<Integer> result) {
        if (treeNode != null) {
            result.add(treeNode.val);
            preOrderTraversal(treeNode.left, result);
            preOrderTraversal(treeNode.right, result);
        }
    }
}
